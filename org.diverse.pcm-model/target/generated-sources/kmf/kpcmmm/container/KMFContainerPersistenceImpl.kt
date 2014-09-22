





package kpcmmm.container

  trait KMFContainerPersistenceImpl : KMFContainerImpl,org.kevoree.modeling.api.persistence.KMFContainerProxy {

    fun checkLazyLoad(){
        if(isDeleted()){
            throw Exception("This object is deleted")
        }
        if(!isResolved){
            isResolved = true
            inResolution = true
            val content = originFactory!!.getTraces(this)
            val previousParent = internal_eContainer
            internal_eContainer = null
            content?.silentlyApplyOn(this)
            originFactory!!.loadInbounds(this)
            internal_eContainer = previousParent
            inResolution = false
            isDirty = false
        }
    }

    override fun setOriginPath(path: String) {
        if (path == "" || !path.startsWith("/")) { // ERROR
            throw Exception("Cannot setOrigin for element with path \""+path+"\" : No reference to a Root")
        }
        if(path == "/") { // ROOT
            this.is_root = true
            this.path_cache = "/"
        } else {
            //set key_cache
            key_cache = path.substring(path.lastIndexOf("[")+1,path.lastIndexOf("]"))

            var parentPath: String
            var currentParentRelationName : String

            if(path.lastIndexOf("/") == 0) { // parent is root
                parentPath = "/"
                currentParentRelationName = path.substring(1, path.length - 1)
                currentParentRelationName = currentParentRelationName.substring(0, currentParentRelationName.lastIndexOf("["))
            } else {
                parentPath = path.substring(0, path.lastIndexOf("/"))
                currentParentRelationName = path.substring(path.lastIndexOf("/") + 1, path.length - 1)
                currentParentRelationName = currentParentRelationName.substring(0, currentParentRelationName.lastIndexOf("["))
            }
            val parentElem = originFactory!!.lookup(parentPath)!!
            internal_unsetCmd = kpcmmm.container.RemoveFromContainerCommand(parentElem, org.kevoree.modeling.api.util.ActionType.REMOVE, currentParentRelationName, this)
            internal_eContainer = parentElem
            internal_containmentRefName = currentParentRelationName

        }
        path_cache = path
    }

}

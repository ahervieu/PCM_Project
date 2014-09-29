

package kpcmmm.container

class RemoveFromContainerCommand(val target : org.kevoree.modeling.api.KMFContainer, val mutatorType : org.kevoree.modeling.api.util.ActionType, val refName : String, val element : Any?) {
    fun run() {

        var casted = target as KMFContainerPersistenceImpl
        if(!casted.inResolution){
            if(element!= null) {
                (element as KMFContainerPersistenceImpl).originFactory!!.elementsToBeRemoved.add((element as KMFContainerImpl).path())
            }
            if(!target.isDeleted()){
                target.reflexiveMutator(mutatorType,refName, element,true,true)
            }
        }
    
    }
}
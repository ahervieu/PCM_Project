





package kpcmmm.container


object cleanCacheVisitor : org.kevoree.modeling.api.util.ModelVisitor() {
    public override fun visit(elem: org.kevoree.modeling.api.KMFContainer, refNameInParent: String, parent: org.kevoree.modeling.api.KMFContainer) {
        }

    public override fun endVisitElem(elem: org.kevoree.modeling.api.KMFContainer) {
        (elem as KMFContainerImpl).path_cache = null
    }

}

trait KMFContainerImpl : org.kevoree.modeling.api.KMFContainer, org.kevoree.modeling.api.util.InboundRefAware {


    
    var internal_is_deleted : Boolean

    override fun isDeleted() : Boolean {
        return internal_is_deleted
    }

    internal open var internal_eContainer : org.kevoree.modeling.api.KMFContainer?
    internal open var internal_unsetCmd : RemoveFromContainerCommand?

    override fun eContainer() : org.kevoree.modeling.api.KMFContainer? { return internal_eContainer }
    internal open var internal_containmentRefName : String?
    internal open var internal_readOnlyElem : Boolean
    internal open var internal_recursive_readOnlyElem : Boolean
    //override open var internal_inboundReferences : java.util.HashMap<org.kevoree.modeling.api.KMFContainer,  MutableSet<String>>
    internal open var internal_deleteInProgress : Boolean

    protected fun addInboundReference(path : org.kevoree.modeling.api.KMFContainer, refName : String) {
        if(!internal_deleteInProgress) {
            internal_inboundReferences.getOrPut(path){java.util.HashSet<String>()}.add(refName)
        }
    }

    protected fun removeInboundReference(path : org.kevoree.modeling.api.KMFContainer, refName : String) {
        if(!internal_deleteInProgress) {
            val refs = internal_inboundReferences.get(path)
            if(refs != null) {
                if(refs.size() > 1) {
                    refs.remove(refName);
                } else {
                    internal_inboundReferences.remove(path);
                }
            }
        }
    }

    protected fun advertiseInboundRefs(action : org.kevoree.modeling.api.util.ActionType, value : Any?) {
        for(inboundElem in internal_inboundReferences.keySet()) {
            if(!inboundElem.isDeleted()){
                val refList = internal_inboundReferences.get(inboundElem)!!
                for(ref in refList) {
                    inboundElem.reflexiveMutator(action, ref, value, false, true)
                }
            }
        }
    }

    override fun setRecursiveReadOnly(){
        if(internal_recursive_readOnlyElem == true){return}
        setInternalRecursiveReadOnly()
        val recVisitor = object : org.kevoree.modeling.api.util.ModelVisitor(){
            override fun visit(elem : org.kevoree.modeling.api.KMFContainer, refNameInParent : String, parent : org.kevoree.modeling.api.KMFContainer){
                if(elem.isRecursiveReadOnly()){
                    noChildrenVisit()
                }else {
                    (elem as KMFContainerImpl).setInternalRecursiveReadOnly()
                    elem.setInternalReadOnly()
                }
            }
        }
        visit(recVisitor,true,true,true)
        setInternalReadOnly()
    }

    override fun setInternalReadOnly(){
        internal_readOnlyElem = true
    }

    fun setInternalRecursiveReadOnly(){
        internal_recursive_readOnlyElem = true
    }

    override fun getRefInParent() : String? {
        return internal_containmentRefName
    }

    override fun isReadOnly() : Boolean {
        return internal_readOnlyElem
    }

    override fun isRecursiveReadOnly() : Boolean {
        return internal_recursive_readOnlyElem
    }

    fun setEContainer( container : org.kevoree.modeling.api.KMFContainer?, unsetCmd : RemoveFromContainerCommand?, refNameInParent : String? ) {
        if(internal_readOnlyElem){return}
        if(eContainer() == container){return}
        (this as KMFContainerImpl).visit(cleanCacheVisitor,true,true,false)
        val tempUnsetCmd = internal_unsetCmd
        internal_unsetCmd = null
        if(tempUnsetCmd != null){
            tempUnsetCmd.run()
        }

        internal_eContainer = container
        internal_unsetCmd = unsetCmd
        internal_containmentRefName = refNameInParent
        path_cache = null
}

override fun select(query : String) : List<org.kevoree.modeling.api.KMFContainer> {
    if(path()=="/" && query.startsWith("/")){
        return org.kevoree.modeling.api.util.Selector.select(this,query.substring(1))
    } else {
        return org.kevoree.modeling.api.util.Selector.select(this,query)
    }
}

    internal var internal_modelElementListeners : MutableList<org.kevoree.modeling.api.events.ModelElementListener>?

    protected fun fireModelEvent(evt : org.kevoree.modeling.api.events.ModelEvent) {
        if(internal_modelElementListeners != null) {
            for(lst in internal_modelElementListeners!!) {
                lst.elementChanged(evt)
            }
        }
        fireModelEventOnTree(evt)
    }

    override fun addModelElementListener(lst : org.kevoree.modeling.api.events.ModelElementListener){
            if(internal_modelElementListeners == null) {
                internal_modelElementListeners = java.util.ArrayList<org.kevoree.modeling.api.events.ModelElementListener>()
            }
            internal_modelElementListeners!!.add(lst)
        }

    override fun removeModelElementListener(lst : org.kevoree.modeling.api.events.ModelElementListener){
            if(internal_modelElementListeners != null) {
                internal_modelElementListeners!!.remove(lst)
                if(internal_modelElementListeners!!.isEmpty()) {
                    internal_modelElementListeners = null
                }
            }
        }

    override fun removeAllModelElementListeners() {
            if(internal_modelElementListeners != null) {
                internal_modelElementListeners!!.clear()
                internal_modelElementListeners = null
            }
        }

        internal var internal_modelTreeListeners : MutableList<org.kevoree.modeling.api.events.ModelElementListener>?

        private fun fireModelEventOnTree(evt: org.kevoree.modeling.api.events.ModelEvent) {
            if(internal_modelTreeListeners != null) {
                for(lst in internal_modelTreeListeners!!) {
                    lst.elementChanged(evt)
                }
            }
            if(eContainer() != null) {
                (eContainer() as KMFContainerImpl).fireModelEventOnTree(evt)
            }
                    }

    override fun addModelTreeListener(lst : org.kevoree.modeling.api.events.ModelElementListener){
            if(internal_modelTreeListeners == null) {
                internal_modelTreeListeners = java.util.ArrayList<org.kevoree.modeling.api.events.ModelElementListener>()
            }
            internal_modelTreeListeners!!.add(lst)
        }

    override fun removeModelTreeListener(lst : org.kevoree.modeling.api.events.ModelElementListener){
            if(internal_modelTreeListeners != null) {
                internal_modelTreeListeners!!.remove(lst)
                if(internal_modelTreeListeners!!.isEmpty()) {
                    internal_modelTreeListeners = null
                }
            }
        }

    override fun removeAllModelTreeListeners() {
            if(internal_modelTreeListeners != null) {
                internal_modelTreeListeners!!.clear()
                internal_modelElementListeners = null
            }
        }


    override fun visit(visitor : org.kevoree.modeling.api.util.ModelVisitor, recursive : Boolean, containedReference : Boolean,nonContainedReference : Boolean){}
    override fun visitAttributes(visitor : org.kevoree.modeling.api.util.ModelAttributeVisitor){}

    fun internal_visit(visitor : org.kevoree.modeling.api.util.ModelVisitor,internalElem : org.kevoree.modeling.api.KMFContainer?,recursive:Boolean,containedReference : Boolean,nonContainedReference : Boolean, refName : String){
        if(internalElem != null){
            if(nonContainedReference && recursive){
                var elemPath = internalElem.path()
                if(visitor.alreadyVisited != null && visitor.alreadyVisited!!.containsKey(elemPath)){return}
                if(visitor.alreadyVisited == null){
                    visitor.alreadyVisited = java.util.HashMap<String,org.kevoree.modeling.api.KMFContainer>()
                }
                visitor.alreadyVisited!!.put(elemPath,internalElem)
            }
            visitor.visit(internalElem,refName,this)
            if(!visitor.visitStopped){
                if(recursive && (visitor.visitChildren || visitor.visitReferences)){
                    val visitSubReferences = nonContainedReference && visitor.visitReferences
                    val visitSubChilds = containedReference && visitor.visitChildren
                    internalElem.visit(visitor,recursive,visitSubChilds,visitSubReferences)
                }
                visitor.visitChildren = true
                visitor.visitReferences = true
            }
        }
    }

    var path_cache : String?
    var key_cache : String?

    override fun isRoot() : Boolean {
        return is_root;
    }

    var is_root : Boolean

    override fun path(): String {
        if(path_cache!=null){return path_cache!!}
        val container = eContainer()
        if(container != null) {
            val parentPath = container.path()
            if(parentPath == "") {
                path_cache = internal_containmentRefName!! + "[" + internalGetKey() + "]"
            } else if(parentPath == "/") {
                path_cache = parentPath + internal_containmentRefName!! + "[" + internalGetKey() + "]"
            } else {
                path_cache = parentPath + "/" + internal_containmentRefName!! + "[" + internalGetKey() + "]"
            }
        } else {
            if(is_root){
                path_cache = "/"
            } else {
                path_cache =  ""
            }
        }
        return path_cache!!;
    }

    override fun modelEquals(similarObj: org.kevoree.modeling.api.KMFContainer?): Boolean {
        if(similarObj == null){return false}
        if(this == similarObj){return true}//same Object
        if(similarObj.metaClassName()!=metaClassName()){return false}
        val values = java.util.HashMap<String,String?>()
        val attVisitor = object : org.kevoree.modeling.api.util.ModelAttributeVisitor {
            public override fun visit(value: Any?, name: String, parent: org.kevoree.modeling.api.KMFContainer){
                if(values.containsKey(name)){
                    if(values.get(name) == value?.toString()){
                        values.remove(name)
                    }
                } else {
                    values.put(name,value?.toString())
                }
            }
        }
        this.visitAttributes(attVisitor)
        similarObj.visitAttributes(attVisitor)
        if(!values.isEmpty()){return false}
        val payload = "";
        val refVisitor = object : org.kevoree.modeling.api.util.ModelVisitor() {
            public override fun visit(elem: org.kevoree.modeling.api.KMFContainer, refNameInParent: String, parent: org.kevoree.modeling.api.KMFContainer) {
                val concatedKey = refNameInParent+"_"+elem.path()
                if(values.containsKey(concatedKey)){
                    values.remove(concatedKey)
                } else {
                    values.put(concatedKey,payload)
                }
            }
        }
        this.visit(refVisitor,false,false,true)
        similarObj.visit(refVisitor,false,false,true)
        if(!values.isEmpty()){return false}
        return true
    }

    override fun deepModelEquals(similarObj: org.kevoree.modeling.api.KMFContainer?): Boolean {
        if(!modelEquals(similarObj)){return false}
        var similarRoot : org.kevoree.modeling.api.KMFContainer = similarObj!!
        while(similarRoot.eContainer() != null){
            similarRoot = similarRoot.eContainer()!!;
        }
        var resultTest = true
        val finalRoot = similarRoot
        val objVisitor = object : org.kevoree.modeling.api.util.ModelVisitor() {
            public override fun visit(elem: org.kevoree.modeling.api.KMFContainer, refNameInParent: String, parent: org.kevoree.modeling.api.KMFContainer) {
                  var similarSubObj = finalRoot.findByPath(elem.path())
                  if(!elem.modelEquals(similarSubObj)){
                      resultTest = false
                      stopVisit()
                  }
            }
        }
        visit(objVisitor,true,true,false)
        return resultTest
    }

    override fun findByPath(query: String): org.kevoree.modeling.api.KMFContainer? {
        if(query == path()){
            return this
        }
        if(path()=="/" && query.startsWith("/")){
            return findByPath(query.substring(1))
        }

        val firstSepIndex = query.indexOf('[')
        if(firstSepIndex == -1){
             if(query.isEmpty()){return this}else{return null}
        }
        var queryID = ""
        var extraReadChar = 2
        val relationName = query.substring(0, query.indexOf('['))
        if(query.indexOf('{') == firstSepIndex + 1){
            queryID = query.substring(query.indexOf('{') + 1, query.indexOf('}'))
            extraReadChar = extraReadChar + 2
        } else {
            var indexFirstClose = query.indexOf(']')
            while( indexFirstClose + 1 < query.length && query.charAt(indexFirstClose + 1) != '/'){
                indexFirstClose = query.indexOf(']',indexFirstClose + 1)
                if(indexFirstClose == -1){
                    return null
                }
            }
            queryID = query.substring(query.indexOf('[') + 1, indexFirstClose)
        }
        var subquery = query.substring(relationName.length + queryID.length + extraReadChar, query.length)
        if (subquery.indexOf('/') != -1){
            subquery = subquery.substring(subquery.indexOf('/') + 1, subquery.length)
        }
        val objFound = findByID(relationName,queryID)
        if(subquery != "" && objFound != null){
             return objFound.findByPath(subquery)
        } else {
             return objFound
        }
    }

    override fun createTraces(similarObj : org.kevoree.modeling.api.KMFContainer?, isInter : Boolean, isMerge : Boolean, onlyReferences : Boolean, onlyAttributes : Boolean) : List<org.kevoree.modeling.api.trace.ModelTrace> {
        val traces = java.util.ArrayList<org.kevoree.modeling.api.trace.ModelTrace>()
        val values = java.util.HashMap<String,String?>()
        if(onlyAttributes){
            val attVisitorFill = object : org.kevoree.modeling.api.util.ModelAttributeVisitor {
                public override fun visit(value: Any?, name: String, parent: org.kevoree.modeling.api.KMFContainer){
                    values.put(name,org.kevoree.modeling.api.util.AttConverter.convFlatAtt(value))
                }
            }
            this.visitAttributes(attVisitorFill)
            val attVisitor = object : org.kevoree.modeling.api.util.ModelAttributeVisitor {
                public override fun visit(value: Any?, name: String, parent: org.kevoree.modeling.api.KMFContainer){
                        var attVal2 : String? = org.kevoree.modeling.api.util.AttConverter.convFlatAtt(value)
                        if(values.get(name) == attVal2){
                            if(isInter) {
                                traces.add(org.kevoree.modeling.api.trace.ModelSetTrace(path(),name,null,attVal2,null))
                            }
                        } else {
                            if(!isInter) {
                                traces.add(org.kevoree.modeling.api.trace.ModelSetTrace(path(),name,null,attVal2,null))
                            }
                        }
                        values.remove(name)
                }
            }
            if(similarObj!=null){similarObj.visitAttributes(attVisitor)}
            if(!isInter && !isMerge && values.size!= 0){
                for(hashLoopRes in values.keySet()){
                    traces.add(org.kevoree.modeling.api.trace.ModelSetTrace(path(),hashLoopRes,null,null,null))
                }
            }
        }
        if(onlyReferences){
            val payload = "";
            val refVisitorFill = object : org.kevoree.modeling.api.util.ModelVisitor() {
                public override fun visit(elem: org.kevoree.modeling.api.KMFContainer, refNameInParent: String, parent: org.kevoree.modeling.api.KMFContainer) {
                    val concatedKey = refNameInParent+"_"+elem.path()
                    values.put(concatedKey,payload)
                }
            }
            this.visit(refVisitorFill,false,false,true)
            val refVisitor = object : org.kevoree.modeling.api.util.ModelVisitor() {
                public override fun visit(elem: org.kevoree.modeling.api.KMFContainer, refNameInParent: String, parent: org.kevoree.modeling.api.KMFContainer) {
                    val concatedKey = refNameInParent+"_"+elem.path()
                    if(values.get(concatedKey) != null){
                        if(isInter){
                            traces.add(org.kevoree.modeling.api.trace.ModelAddTrace(path(),refNameInParent,elem.path(),null))
                        }
                    } else {
                       if(!isInter){
                            traces.add(org.kevoree.modeling.api.trace.ModelAddTrace(path(),refNameInParent,elem.path(),null))
                       }
                    }
                    values.remove(concatedKey)
                }
            }
            if(similarObj!=null){similarObj.visit(refVisitor,false,false,true)}
            if(!isInter && !isMerge && values.size!= 0){
                for(hashLoopRes in values.keySet()){
                    val splittedVal = hashLoopRes.split("_");
                    traces.add(org.kevoree.modeling.api.trace.ModelRemoveTrace(path(),splittedVal.get(0),splittedVal.get(1)))
                }
            }
        }
        return traces
    }

        override fun toTraces(attributes : Boolean, references : Boolean) : List<org.kevoree.modeling.api.trace.ModelTrace> {
        val traces = java.util.ArrayList<org.kevoree.modeling.api.trace.ModelTrace>()
        if(attributes){
            val attVisitorFill = object : org.kevoree.modeling.api.util.ModelAttributeVisitor {
                public override fun visit(value: Any?, name: String, parent: org.kevoree.modeling.api.KMFContainer){
                    traces.add(org.kevoree.modeling.api.trace.ModelSetTrace(path(),name,null,org.kevoree.modeling.api.util.AttConverter.convFlatAtt(value),null))
                }
            }
            this.visitAttributes(attVisitorFill)
        }
        if(references){
            val refVisitorFill = object : org.kevoree.modeling.api.util.ModelVisitor() {
                public override fun visit(elem: org.kevoree.modeling.api.KMFContainer, refNameInParent: String, parent: org.kevoree.modeling.api.KMFContainer) {
                    traces.add(org.kevoree.modeling.api.trace.ModelAddTrace(path(),refNameInParent,elem.path(),null))
                }
            }
            this.visit(refVisitorFill,false,true,true)
        }
        return traces
    }


    override fun visitNotContained(visitor: org.kevoree.modeling.api.util.ModelVisitor){ visit(visitor,false,false,true); }

    override fun visitContained(visitor: org.kevoree.modeling.api.util.ModelVisitor){ visit(visitor,false,true,false); }

    override fun visitReferences(visitor: org.kevoree.modeling.api.util.ModelVisitor){ visit(visitor,false,true,true); }

    override fun deepVisitNotContained(visitor: org.kevoree.modeling.api.util.ModelVisitor){ visit(visitor,true,false,true); }

    override fun deepVisitContained(visitor: org.kevoree.modeling.api.util.ModelVisitor){ visit(visitor,true,true,false); }

    override fun deepVisitReferences(visitor: org.kevoree.modeling.api.util.ModelVisitor){ visit(visitor,true,true,true); }

}

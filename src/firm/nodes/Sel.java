/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Sel extends Node {

	
	public Sel(Block block, Node mem, Node ptr, Node[] ins, firm.Entity entity) {
		super(binding_cons.new_r_Sel(firm.Graph.getCurrent().ptr, block.ptr, mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), entity.ptr));
	}
	

	public Sel(Pointer ptr) {
		super(ptr);
	}

	
	public Node getMem() {
		return createWrapper(binding.get_Sel_mem(ptr));
	}

	public void setMem(Node mem) {
		binding.set_Sel_mem(this.ptr, mem.ptr);
	}
	
	public Node getPtr() {
		return createWrapper(binding.get_Sel_ptr(ptr));
	}

	public void setPtr(Node ptr) {
		binding.set_Sel_ptr(this.ptr, ptr.ptr);
	}
	

	
	public firm.Entity getEntity() {
		Pointer _res = binding.get_Sel_entity(ptr);
		return new firm.Entity(_res);
	}

	public void setEntity(firm.Entity _val) {
		binding.set_Sel_entity(this.ptr, _val.ptr);
	}
	

	

	
}
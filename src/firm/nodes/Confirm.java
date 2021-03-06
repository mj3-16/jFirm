/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Confirm extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Confirm(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Confirm();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Confirm(Pointer ptr) {
		super(ptr);
	}

	public Node getValue() {
		return createWrapper(firm.bindings.binding_irnode.get_Confirm_value(ptr));
	}

	public void setValue(Node value) {
		firm.bindings.binding_irnode.set_Confirm_value(this.ptr, value.ptr);
	}

	public Node getBound() {
		return createWrapper(firm.bindings.binding_irnode.get_Confirm_bound(ptr));
	}

	public void setBound(Node bound) {
		firm.bindings.binding_irnode.set_Confirm_bound(this.ptr, bound.ptr);
	}

	public firm.Relation getRelation() {
		int _res = firm.bindings.binding_irnode.get_Confirm_relation(ptr);
		return firm.Relation.fromValue(_res);
	}

	public void setRelation(firm.Relation _val) {
		firm.bindings.binding_irnode.set_Confirm_relation(this.ptr, _val.value());
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}

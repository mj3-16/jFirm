package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.NativeLong;


public interface binding_iredges extends Library {
	public static enum ip_view_state {
		ip_view_no(),
		ip_view_valid(),
		ip_view_invalid();
		public final int val;
		private static class C { static int next_val; }

		ip_view_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ip_view_state() {
			this.val = C.next_val++;
		}
		
		public static ip_view_state getEnum(int val) {
			for(ip_view_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum op_pin_state {
		op_pin_state_floats(0),
		op_pin_state_pinned(1),
		op_pin_state_exc_pinned(),
		op_pin_state_mem_pinned();
		public final int val;
		private static class C { static int next_val; }

		op_pin_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		op_pin_state() {
			this.val = C.next_val++;
		}
		
		public static op_pin_state getEnum(int val) {
			for(op_pin_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum mtp_additional_property {
		mtp_no_property(0),
		mtp_property_const(1),
		mtp_property_pure(2),
		mtp_property_noreturn(4),
		mtp_property_nothrow(8),
		mtp_property_naked(16),
		mtp_property_malloc(32),
		mtp_property_weak(64),
		mtp_property_returns_twice(128),
		mtp_property_intrinsic(256),
		mtp_property_runtime(512),
		mtp_property_private(1024),
		mtp_property_has_loop(2048),
		mtp_property_inherited((1<<31));
		public final int val;
		private static class C { static int next_val; }

		mtp_additional_property(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		mtp_additional_property() {
			this.val = C.next_val++;
		}
		
		public static mtp_additional_property getEnum(int val) {
			for(mtp_additional_property entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum symconst_kind {
		symconst_type_tag(),
		symconst_type_size(),
		symconst_type_align(),
		symconst_addr_name(),
		symconst_addr_ent(),
		symconst_ofs_ent(),
		symconst_enum_const(),
		symconst_label();
		public final int val;
		private static class C { static int next_val; }

		symconst_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		symconst_kind() {
			this.val = C.next_val++;
		}
		
		public static symconst_kind getEnum(int val) {
			for(symconst_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Cmp {
		pn_Cmp_False(0),
		pn_Cmp_Eq(1),
		pn_Cmp_Lt(2),
		pn_Cmp_Le((pn_Cmp.pn_Cmp_Eq.val|pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Gt(4),
		pn_Cmp_Ge((pn_Cmp.pn_Cmp_Eq.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Lg((pn_Cmp.pn_Cmp_Lt.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Leg(((pn_Cmp.pn_Cmp_Lt.val|pn_Cmp.pn_Cmp_Eq.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Uo(8),
		pn_Cmp_Ue((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Eq.val)),
		pn_Cmp_Ul((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Ule(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Eq.val)|pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Ug((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Uge(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Eq.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Ne(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Lt.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_True(15);
		public final int val;
		private static class C { static int next_val; }

		pn_Cmp(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Cmp() {
			this.val = C.next_val++;
		}
		
		public static pn_Cmp getEnum(int val) {
			for(pn_Cmp entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_where_alloc {
		stack_alloc(),
		heap_alloc();
		public final int val;
		private static class C { static int next_val; }

		ir_where_alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_where_alloc() {
			this.val = C.next_val++;
		}
		
		public static ir_where_alloc getEnum(int val) {
			for(ir_where_alloc entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_builtin_kind {
		ir_bk_trap(),
		ir_bk_debugbreak(),
		ir_bk_return_address(),
		ir_bk_frame_address(),
		ir_bk_prefetch(),
		ir_bk_ffs(),
		ir_bk_clz(),
		ir_bk_ctz(),
		ir_bk_popcount(),
		ir_bk_parity(),
		ir_bk_bswap(),
		ir_bk_inport(),
		ir_bk_outport(),
		ir_bk_inner_trampoline();
		public final int val;
		private static class C { static int next_val; }

		ir_builtin_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_builtin_kind() {
			this.val = C.next_val++;
		}
		
		public static ir_builtin_kind getEnum(int val) {
			for(ir_builtin_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_edge_kind_t {
		EDGE_KIND_NORMAL(),
		EDGE_KIND_BLOCK(),
		EDGE_KIND_DEP(),
		EDGE_KIND_LAST();
		public final int val;
		private static class C { static int next_val; }

		ir_edge_kind_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_edge_kind_t() {
			this.val = C.next_val++;
		}
		
		public static ir_edge_kind_t getEnum(int val) {
			for(ir_edge_kind_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	Pointer __builtin_alloca();
	double __builtin_huge_val();
	double __builtin_inf();
	float __builtin_inff();
	double __builtin_infl();
	double __builtin_nan();
	float __builtin_nanf();
	double __builtin_nanl();
	void __builtin_va_end();
	NativeLong __builtin_expect();
	Pointer __builtin_return_address();
	Pointer __builtin_frame_address();
	int __builtin_ffs();
	int __builtin_clz();
	int __builtin_ctz();
	int __builtin_popcount();
	int __builtin_parity();
	float __builtin_prefetch(Object ... args);
	void __builtin_trap();
	void edges_notify_edge_kind(Pointer src, int pos, Pointer tgt, Pointer old_tgt, /* ir_edge_kind_t */int kind, Pointer irg);
	Pointer get_irn_out_edge_first_kind(Pointer irn, /* ir_edge_kind_t */int kind);
	Pointer get_irn_out_edge_next(Pointer irn, Pointer last);
	Pointer get_edge_src_irn(Pointer edge);
	int get_edge_src_pos(Pointer edge);
	Pointer get_irn_edge_kind(Pointer irg, Pointer irn, int pos, /* ir_edge_kind_t */int kind);
	int get_irn_n_edges_kind(Pointer irn, /* ir_edge_kind_t */int kind);
	int edges_activated_kind(Pointer irg, /* ir_edge_kind_t */int kind);
	void edges_activate_kind(Pointer irg, /* ir_edge_kind_t */int kind);
	void edges_deactivate_kind(Pointer irg, /* ir_edge_kind_t */int kind);
	void edges_reroute_kind(Pointer old, Pointer nw, /* ir_edge_kind_t */int kind, Pointer irg);
	int edges_verify(Pointer irg);
	void edges_init_dbg(int do_dbg);
	Pointer get_irn_edge(Pointer irg, Pointer src, int pos);
	void edges_activate(Pointer irg);
	void edges_deactivate(Pointer irg);
	int edges_assure(Pointer irg);
	int edges_assure_kind(Pointer irg, /* ir_edge_kind_t */int kind);
	void edges_node_deleted(Pointer irn, Pointer irg);
	void edges_notify_edge(Pointer src, int pos, Pointer tgt, Pointer old_tgt, Pointer irg);
	void irg_block_edges_walk(Pointer block, Pointer pre, Pointer post, Pointer env);
	void edges_reset_private_data(Pointer irg, int offset, int size);
}

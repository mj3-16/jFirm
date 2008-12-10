package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.NativeLong;


public interface binding_iroptimize extends Library {
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
	public static enum osr_flags {
		osr_flag_none(0),
		osr_flag_lftr_with_ov_check(1),
		osr_flag_ignore_x86_shift(2),
		osr_flag_keep_reg_pressure(4);
		public final int val;
		private static class C { static int next_val; }

		osr_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		osr_flags() {
			this.val = C.next_val++;
		}
		
		public static osr_flags getEnum(int val) {
			for(osr_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	void optimize_cf(Pointer irg);
	void opt_cond_eval(Pointer irg);
	void opt_bool(Pointer irg);
	int conv_opt(Pointer irg);
	void data_flow_scalar_replacement_opt(Pointer irg);
	void escape_enalysis_irg(Pointer irg, Pointer callback);
	void escape_analysis(int run_scalar_replace, Pointer callback);
	void optimize_funccalls(int force_run, Pointer callback);
	void do_gvn_pre(Pointer irg);
	void opt_if_conv(Pointer irg, Pointer params);
	void opt_sync(Pointer irg);
	Pointer can_replace_load_by_const(Pointer load, Pointer c);
	int optimize_load_store(Pointer irg);
	void optimize_loop_unrolling(Pointer irg);
	void opt_frame_irg(Pointer irg);
	void opt_osr(Pointer irg, int flags);
	void remove_phi_cycles(Pointer irg);
	void proc_cloning(float threshold);
	int optimize_reassociation(Pointer irg);
	void normalize_one_return(Pointer irg);
	void normalize_n_returns(Pointer irg);
	int scalar_replacement_opt(Pointer irg);
	void reduce_strength(Pointer irg);
	int opt_tail_rec_irg(Pointer irg);
	void opt_tail_recursion();
	void normalize_irp_class_casts(Pointer gppt_fct);
	void normalize_irg_class_casts(Pointer irg, Pointer gppt_fct);
	void optimize_class_casts();
	void combo(Pointer irg);
	void inline_small_irgs(Pointer irg, int size);
	void inline_leave_functions(int maxsize, int leavesize, int size, int ignore_runtime);
	void inline_functions(int maxsize, int inline_threshold);
	int shape_blocks(Pointer irg);
}

package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:1720</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_translate_coordinates_request_t extends Structure {
	/** < */
	public byte major_opcode;
	/** < */
	public byte pad0;
	/** < */
	public short length;
	/**
	 * <<br>
	 * C type : xcb_window_t
	 */
	public int src_window;
	/**
	 * <<br>
	 * C type : xcb_window_t
	 */
	public int dst_window;
	/** < */
	public short src_x;
	/** < */
	public short src_y;
	public xcb_translate_coordinates_request_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("major_opcode", "pad0", "length", "src_window", "dst_window", "src_x", "src_y");
	}
	/**
	 * @param major_opcode <<br>
	 * @param pad0 <<br>
	 * @param length <<br>
	 * @param src_window <<br>
	 * C type : xcb_window_t<br>
	 * @param dst_window <<br>
	 * C type : xcb_window_t<br>
	 * @param src_x <<br>
	 * @param src_y <
	 */
	public xcb_translate_coordinates_request_t(byte major_opcode, byte pad0, short length, int src_window, int dst_window, short src_x, short src_y) {
		super();
		this.major_opcode = major_opcode;
		this.pad0 = pad0;
		this.length = length;
		this.src_window = src_window;
		this.dst_window = dst_window;
		this.src_x = src_x;
		this.src_y = src_y;
	}
	public xcb_translate_coordinates_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_translate_coordinates_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_translate_coordinates_request_t implements Structure.ByValue {
		
	};
}
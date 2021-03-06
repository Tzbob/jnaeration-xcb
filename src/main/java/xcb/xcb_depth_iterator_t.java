package xcb;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : xcb/xproto.h:199</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class xcb_depth_iterator_t extends Structure {
	/**
	 * <<br>
	 * C type : xcb_depth_t*
	 */
	public xcb.xcb_depth_t.ByReference data;
	/** < */
	public int rem;
	/** < */
	public int index;
	public xcb_depth_iterator_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("data", "rem", "index");
	}
	/**
	 * @param data <<br>
	 * C type : xcb_depth_t*<br>
	 * @param rem <<br>
	 * @param index <
	 */
	public xcb_depth_iterator_t(xcb.xcb_depth_t.ByReference data, int rem, int index) {
		super();
		this.data = data;
		this.rem = rem;
		this.index = index;
	}
	public xcb_depth_iterator_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends xcb_depth_iterator_t implements Structure.ByReference {
		
	};
	public static class ByValue extends xcb_depth_iterator_t implements Structure.ByValue {
		
	};
}

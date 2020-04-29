package dji.thirdparty.okhttp3;

import dji.thirdparty.okhttp3.internal.Util;
import java.nio.charset.Charset;
import okio.ByteString;

public final class Credentials {
    private Credentials() {
    }

    public static String basic(String username, String password) {
        return basic(username, password, Util.ISO_8859_1);
    }

    public static String basic(String username, String password, Charset charset) {
        return "Basic " + ByteString.encodeString(username + ":" + password, charset).base64();
    }
}
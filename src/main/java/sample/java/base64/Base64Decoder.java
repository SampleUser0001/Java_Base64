package sample.java.base64;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;

public class Base64Decoder {
    public static void main(String[] args) throws IOException {

        // Base64エンコード済みのファイルを読み込み
        byte[] fileContent = FileUtils.readFileToByteArray(new File(Util.ENCODED_IMAGE));

        // 読み込みデータをデコード
        byte[] decodedBytes = Base64.getDecoder().decode(fileContent);

        // デコード結果を書き込み
        FileUtils.writeByteArrayToFile(new File(Util.DECODED_IMAGE), decodedBytes);
    }
}

package sample.java.base64;

import java.io.File;
import java.util.Base64;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Hello world!
 *
 */
public class Base64Encoder {

    public static void main( String[] args ) throws IOException , UnsupportedEncodingException {
        // 画像ファイルをバイナリとして読み込み
        byte[] fileContent
            = FileUtils.readFileToByteArray(
                new File(Util.ORIGINAL_IMAGE_NAME));
        
        // Base64にエンコード
        String encodedString = Base64.getEncoder().encodeToString(fileContent);

        // お試しで文字列出力
        System.out.println(encodedString);

        // エンコード結果をファイル出力
        Files.write(
            Paths.get(Util.ENCODED_IMAGE), 
            encodedString.getBytes(), 
            StandardOpenOption.CREATE, 
            StandardOpenOption.WRITE);
    }
}

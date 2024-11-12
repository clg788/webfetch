
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		URL url = new URL("");
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String line = reader.readLine();
		StringBuilder responseStr = new StringBuilder();
		responseStr.setLength(0);
		responseStr.append(line);
		while ((line = reader.readLine()) != null && responseStr.length() < 10000000) {
			responseStr.append(line);
		}
		is.close();
		System.out.println(responseStr);
		// String path = new File(".").getCanonicalPath();
		// System.out.println(path);
	}
}

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileFownloader implements Downloader {
    private String userAgent;

    public FileFownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url, String destinationPath) {
        try {
            System.out.println("dang tai file url: " + url);
            System.out.println("su dung user-agent: " + userAgent);

            URL objUrl = new URL(url);
            URLConnection connection = objUrl.openConnection();

            connection.setRequestProperty("USER-Agent", userAgent);

            try (InputStream in = connection.getInputStream()) {
                File targetFile = new File(destinationPath);
                Files.copy(in, targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("tai file ve thanh cong: " + destinationPath);
            }

        } catch (Exception e) {
            System.out.println("loi khi tai file: " + e.getMessage());
            e.printStackTrace();
        }
    }

}

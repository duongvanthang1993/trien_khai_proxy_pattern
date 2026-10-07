public class FileDownloaderProxy implements Downloader {
    private FileFownloader fileFownloader;

    private static final String FIREFOX_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/121.0";

    @Override
    public void download(String url, String destinationPath) {
        if (fileFownloader == null) {
            fileFownloader = new FileFownloader(FIREFOX_USER_AGENT);
        }
        fileFownloader.download(url, destinationPath);
    }
}

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        String fileUrl = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png";
        String destination = "downloaded_logo.png";

        System.out.println("bat dau chay chuong trinh");
        downloader.download(fileUrl, destination);
    }

}

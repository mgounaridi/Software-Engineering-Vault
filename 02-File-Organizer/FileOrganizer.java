import java.nio.file.*;
import java.io.IOException;

public class FileOrganizer {
    public static void main(String[] args) {

        String home = System.getProperty("user.home");
        Path targetFolder = Paths.get(home, "Downloads");

        System.out.println("Scanning folder:" + targetFolder);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(targetFolder)) {

            for (Path item : stream) {
                if (Files.isRegularFile(item)) {
                    String fileName = item.getFileName().toString();

                    if (fileName.startsWith(".")) {
                        continue;
                    }
                    System.out.println("Processing:" + fileName);

                    String folderName = "Others";
                    int dotIndex = fileName.lastIndexOf('.');

                    if (dotIndex > 0) {
                        String extension = fileName.substring(dotIndex + 1).toLowerCase();

                        if (extension.equals("png") || extension.equals("jpg") || extension.equals("jpeg")) {
                            folderName = "Images";
                        } else if (extension.equals("pdf") || extension.equals("txt") || extension.equals("docx")) {
                            folderName = "Documents";
                        } else if (extension.equals("zip") || extension.equals("rar")) {
                            folderName = "Archives";
                        } else if (extension.equals("dmg") || extension.equals("pkg")) {
                            folderName = "Installers";
                        } else if (extension.equals("csv") || extension.equals("xlsx")) {
                            folderName = "Data";
                        } else if (extension.equals("mp4") || extension.equals("mov")) {
                            folderName = "Video";
                        }
                    }
                    Path newDir = targetFolder.resolve(folderName);
                    Files.createDirectories(newDir);

                    Path destination = newDir.resolve(fileName);
                    Files.move(item, destination, StandardCopyOption.REPLACE_EXISTING);

                    System.out.println("-> Moved to" + folderName + "/");
                }
            }
            System.out.println("Organization complete!");

        } catch (NoSuchFileException e) {

            System.out.println("Could not find the folder. Did you name it TestSorter on the Desktop?");

        } catch (IOException e) {

            System.out.println("An error occurred:" + e.getMessage());
        }
    }
}

package Assignment2;

import java.io.File;

public class FileCounter {
    public static void main(String[] args) {
        return;
    }

    public static void count(Criteria criteria) {
        File directory = new File(criteria.getFolderPath());

    }
}

class Criteria {
    private String folderPath;
    private boolean containSubFolder;
    private String fileExtension;

    public Criteria(String folderPath, boolean containSubFolder, String fileExtension) {
        this.folderPath = folderPath;
        this.containSubFolder = containSubFolder;
        this.fileExtension = fileExtension;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public boolean isContainSubFolder() {
        return containSubFolder;
    }

    public String getFileExtension() {
        return fileExtension;
    }
}
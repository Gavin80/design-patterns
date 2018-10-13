package com.gavin.composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
    void killVirus();
    void add(AbstractFile file);
    List<AbstractFile> getChilds();
}

abstract class File implements AbstractFile {
    @Override
    public void add(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<AbstractFile> getChilds() {
        throw new UnsupportedOperationException();
    }

}

interface FolderFile extends AbstractFile {
}

class Image extends File {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("image "+ this.name +" virus killing...");
    }


}

class Video extends File {
    private String name;

    public Video(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("video " + this.name +" virus killing...");
    }
}

class Folder implements FolderFile {
    private String name;
    private List<AbstractFile> childs = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("folder " + this.name + " virus killing...");
        for (AbstractFile child : this.childs) {
            child.killVirus();
        }
    }

    @Override
    public void add(AbstractFile file) {
        childs.add(file);
    }

    @Override
    public List<AbstractFile> getChilds() {
        return childs;
    }
}


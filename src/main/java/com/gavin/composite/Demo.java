package com.gavin.composite;

public class Demo {
    public static void main(String[] args) {
        AbstractFile document = new Folder("document");
        AbstractFile jpg = new Image("jpg");
        AbstractFile png = new Image("png");
        document.add(jpg);
        document.add(png);

        AbstractFile vedio = new Folder("vedio");
        AbstractFile avi = new Video("avi");
        AbstractFile rmvb = new Video("rmvb");
        vedio.add(avi);
        vedio.add(rmvb);

        document.add(vedio);
        document.killVirus();
    }
}

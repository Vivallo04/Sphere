package com.sphere.backend;

import java.io.FileWriter;
import java.io.IOException;

public class Emitter implements IEmitter {

    private final String fullPath;
    private String header;
    private String code;

    public Emitter(String fullPath) {
        this.fullPath = fullPath;
        this.header = "";
        this.code = "";
    }

    public void emit(String code) {
        this.code += code;
    }

    public void emitLine(String code) {
        this.code += code + '\n';
    }

    public void headerLine(String code) {
        this.header += code + '\n';
    }

    public void writeFile() {
        try {
            FileWriter writer = new FileWriter(fullPath);
            writer.write(header + code);
            writer.close();
            System.out.println("File was written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}

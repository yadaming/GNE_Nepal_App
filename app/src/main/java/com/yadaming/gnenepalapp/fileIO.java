package com.yadaming.gnenepalapp;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import android.os.Environment;
import android.util.Log;

// thanks to learn2crack for the android-read-write-file explanation. that's where a lot of this comes from
/* Implementation
set filename to be passed to write
set file content with survey answers
fileIO fio = new fileIO();
call fio.write with the filename and content
 */
public class fileIO {
    public fileIO() {
    }

    public Boolean write(String filename, String filecontent) {
        try {
            String filepath = Environment.getExternalStorageDirectory().getPath() + filename + ".txt";
            File file = new File(filepath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter filewriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferwriter = new BufferedWriter(filewriter);
            bufferwriter.write(filecontent);
            bufferwriter.close();
            Log.d("Written Success", "Written Success");
            return true;
        } catch (IOException exception) {
            exception.printStackTrace();
            return false;
        }
    }
}


package com.yadaming.gnenepalapp;

import android.os.Environment;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
            //
            //String filepath = Environment.getExternalStorageDirectory().getPath() + filename + ".txt";

            // Try getting the filepath of the downloads directory
            File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);

            //File file = new File(filepath);
            String data_filename = filename + ".txt";
            File file = new File(path, data_filename);

            if (!file.exists())
            {
                // createNewFile returns a public boolean that we don't care about
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


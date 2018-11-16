package sevenbits.workshopthree.first;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FileScanner {


    private long i = 0;

    public void scan(final String filename, final String dirname) {
        try (OutputStream out = new FileOutputStream(filename)) {
            scan(new File(dirname), out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private List<String> findAllFiles(final File dir) {
        List<String> result = new ArrayList<>();
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    try {
                        result.add(f.getName() + " DIR " + f.canRead() + " " + f.canWrite() + " " + f.canExecute() + " " + f.getCanonicalPath() + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    result.addAll(findAllFiles(f));
                    continue;
                }
                try {
                    result.add(f.getName() + " FILE " + f.canRead() + " " + f.canWrite() + " " + f.canExecute() + " " + f.getCanonicalPath() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }


    private void scan(final File dir, final OutputStream out) {
        try {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        out.write((f.getName() +
                                " DIR " + f.canRead() +
                                " " + f.canWrite() +
                                " " + f.canExecute() +
                                " " + f.getCanonicalPath() + "\n").getBytes(Charset.forName("UTF-8")));

                        scan(f, out);
                        i++;
                        if (i % 5 == 0) {
                            out.flush();
                        }
                        continue;
                    }
                    out.write((f.getName() +
                            " FILE " + f.canRead() +
                            " " + f.canWrite() +
                            " " + f.canExecute() +
                            " " + f.getCanonicalPath() + "\n").getBytes(Charset.forName("UTF-8")));

                    scan(f, out);
                    i++;
                    if (i % 5 == 0) {
                        out.flush();
                    }

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

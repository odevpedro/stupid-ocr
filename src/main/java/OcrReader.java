import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class OcrReader {
    public static void main(String[] args) throws TesseractException {
        String inputFilePath = "C:\\Users\\pedro\\Documents\\stuffsForOrcr\\22.png";


        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/C:\\Users\\pedro\\Documents\\stuffsForOrcr");

        String fullText = tesseract.doOCR(new File(inputFilePath));
        System.out.println(fullText);
    }
}

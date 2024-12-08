import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileOutputStream;

public class PdfGenerator {

    public static void generatePdf(String filePath, String nome, String cognome, String email, String consensi) {
        try {
            // Creazione del writer per il file PDF
            PdfWriter writer = new PdfWriter(new FileOutputStream("privacy-consenso.pdf"));

            // Creazione del documento PDF
            PdfDocument pdfDocument = new PdfDocument(writer);
            Document document = new Document(pdfDocument);

            // Aggiunta di contenuti al PDF
            document.add(new Paragraph("Dati Cliente"));
            document.add(new Paragraph("Nome: " + nome));
            document.add(new Paragraph("Cognome: " + cognome));
            document.add(new Paragraph("Email: " + email));
            document.add(new Paragraph("Consensi: " + consensi));

            // Chiusura del documento
            document.close();

            System.out.println("PDF generato con successo: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

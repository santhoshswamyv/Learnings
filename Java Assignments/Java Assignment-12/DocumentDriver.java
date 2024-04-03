package javaassignment12;

//Question5
public class DocumentDriver {
	public static void main(String[] args) {
		Document pd = new PDFDocument("document.pdf");
		Document td = new TextDocument("document.txt");
		Document id = new ImageDocument("image.jpg");

		pd.displayInfo();
		System.out.println();

		td.displayInfo();
		System.out.println();

		id.displayInfo();
	}
}

abstract class Document {
	private String fileName;

	public Document(String fileName) {
		this.fileName = fileName;
	}

	public abstract String getContentType();

	public void displayInfo() {
		System.out.println("File Name: " + fileName);
		System.out.println("Content Type: " + getContentType());
	}
}

class PDFDocument extends Document {
	public PDFDocument(String fileName) {
		super(fileName);
	}

	@Override
	public String getContentType() {
		return "PDF";
	}
}

class TextDocument extends Document {
	public TextDocument(String fileName) {
		super(fileName);
	}

	@Override
	public String getContentType() {
		return "Text";
	}
}

class ImageDocument extends Document {
	public ImageDocument(String fileName) {
		super(fileName);
	}

	@Override
	public String getContentType() {
		return "Image";
	}
}

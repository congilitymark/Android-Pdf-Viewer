package com.ishan.androidpdf;

import net.sf.andpdf.pdfviewer.PdfViewerActivity;

import org.appcelerator.titanium.TiApplication;

import android.os.Bundle;

public class pdfviewer extends PdfViewerActivity {

	String packageName = TiApplication.getInstance().getPackageName();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	public int getPreviousPageImageResource() {
		int left_arrow = TiApplication.getInstance().getResources()
				.getIdentifier("left_arrow", "drawable", packageName);
		return left_arrow;
	}

	public int getNextPageImageResource() {
		int right_arrow = TiApplication.getInstance().getResources()
				.getIdentifier("right_arrow", "drawable", packageName);
		return right_arrow;
	}

	public int getZoomInImageResource() {
		int zoom_in = TiApplication.getInstance().getResources()
				.getIdentifier("zoom_in", "drawable", packageName);
		return zoom_in;
	}

	public int getZoomOutImageResource() {
		int zoom_out = TiApplication.getInstance().getResources()
				.getIdentifier("zoom_out", "drawable", packageName);
		return zoom_out;
	}

	public int getPdfPasswordLayoutResource() {
		int pdf_file_password = TiApplication.getInstance().getResources()
				.getIdentifier("pdf_file_password", "layout", packageName);
		return pdf_file_password;
	}

	public int getPdfPageNumberResource() {
		int dialog_pagenumber = TiApplication.getInstance().getResources()
				.getIdentifier("dialog_pagenumber", "layout", packageName);
		return dialog_pagenumber;
	}

	public int getPdfPasswordEditField() {
		int etPassword_resID = TiApplication.getInstance().getResources()
				.getIdentifier("etPassword", "id", packageName);

		return etPassword_resID;
	}

	public int getPdfPasswordOkButton() {
		int btOK = TiApplication.getInstance().getResources()
				.getIdentifier("btOK", "id", packageName);
		return btOK;
	}

	public int getPdfPasswordExitButton() {
		int btExit = TiApplication.getInstance().getResources()
				.getIdentifier("btExit", "id", packageName);
		return btExit;
	}

	public int getPdfPageNumberEditField() {
		int pagenum_edit = TiApplication.getInstance().getResources()
				.getIdentifier("pagenum_edit", "id", packageName);
		return pagenum_edit;
	}
}

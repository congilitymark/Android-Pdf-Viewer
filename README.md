Android-Pdf-Viewer
==================

Titanium Appcelerator Module
This is a android module for viewing the pdf files inside your titanium android applications.

Following is the example to use.

// open a single window

</br>
var win = Ti.UI.createWindow({
	backgroundColor : 'white'
});
</br>
var androidpdf = require('com.ishan.androidpdf');
</br>
Ti.API.info("module is => " + androidpdf);
</br>

//To open a pdf the file should be present inside your application directory folder, like com.xyz.abcApp folder.
//Now call the openPdf method.

</br>
/*
 * This method accepts a dictionary with a key-value pair.
 * fileName is the name of the file minus the .pdf extension.
 */


</br>


androidpdf.openPDF({
	'fileName' : 'Name of the file without .pdf extension.'
})


</br>


win.open();

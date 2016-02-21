# AndroidWebJS
Experimental project to learn how Android Apps interface with WebView javascript.

The setup:
- WebView filled up device width and height
- Android will load in index.html (stored in app's raw asset), and give it to webview.
- index.html will go to jquery CDN and load jquery js files.
- index.html will show a label and a button.
- if the button in the index.html is clicked, it will call into Android's layer method.  This is done through the JavaScript interface provided by the Android API.
- The android layer will have a button and a TextView on top of the WebView.
- If the button in the android world is clicked, it will call the changeText() function from index.html, which will in turn change the html label to "I'm called from Android!".
- If the button in index.html is clicked, then the Android TextView will be updated.


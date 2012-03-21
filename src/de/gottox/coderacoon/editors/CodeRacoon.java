package de.gottox.coderacoon.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class CodeRacoon extends TextEditor {

	private ColorManager colorManager;

	public CodeRacoon() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}

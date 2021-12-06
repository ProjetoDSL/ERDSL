package org.xtext.unipampa.erdsl.ui.codemining;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.codemining.ICodeMining;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.codemining.AbstractXtextCodeMiningProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.IAcceptor;

@SuppressWarnings("all")
public class ErDslCodeMiningProvider extends AbstractXtextCodeMiningProvider {
  @Override
  public void createCodeMinings(final IDocument document, final XtextResource resource, final CancelIndicator indicator, final IAcceptor<? super ICodeMining> acceptor) throws BadLocationException {
  }
}

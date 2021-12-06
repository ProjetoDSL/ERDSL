package org.xtext.unipampa.erdsl.ui.codemining

import org.eclipse.jface.text.BadLocationException
import org.eclipse.jface.text.IDocument
import org.eclipse.jface.text.codemining.ICodeMining
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.codemining.AbstractXtextCodeMiningProvider
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.IAcceptor
import org.xtext.unipampa.erdsl.erDsl.Entity
import org.xtext.unipampa.erdsl.erDsl.ERModel

class ErDslCodeMiningProvider extends AbstractXtextCodeMiningProvider {
	override void createCodeMinings(IDocument document, XtextResource resource, CancelIndicator indicator,
		IAcceptor<? super ICodeMining> acceptor) throws BadLocationException {
		
		// TODO: implement me
		// use acceptor.accept(super.createNewLineHeaderCodeMining(...)) to add a new code mining to the final list
		
		
//		val modeloER = resource.contents.get(0) as ERModel
//		var ent = 0
//		var rel = 0
//		
//		for (e : modeloER.entities) {
//			ent = ent + 1
//		}
//		
//		for (e : modeloER.relations) {
//			rel = rel + 1
//		}
//
//		acceptor.accept(createNewLineHeaderCodeMining(0, document, " There are ["+ ent.toString +"] modeled entity(ies) and ["+ rel.toString +"] relationship(s) "))
//		
//		ent = 0
//		rel = 0
	}
}

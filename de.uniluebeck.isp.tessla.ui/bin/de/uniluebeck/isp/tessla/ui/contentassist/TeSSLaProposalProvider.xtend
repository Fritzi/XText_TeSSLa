/*
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import de.uniluebeck.isp.tessla.teSSLa.Model

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class TeSSLaProposalProvider extends AbstractTeSSLaProposalProvider {
	
	override void complete_typedExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		super.complete_out(model, ruleCall, context, acceptor)
	
		val Model rootModel = context.rootModel as Model
		
		for(statement : rootModel.spec){
			if(statement.def !== null){
				val String proposal = statement.def.name
				acceptor.accept(createCompletionProposal(proposal, context))
			} else if(statement.in !== null){
				val String proposal = statement.in.name
				acceptor.accept(createCompletionProposal(proposal, context))
			}
		}
	}
	
	override void complete_value(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		super.complete_out(model, ruleCall, context, acceptor)
	
		val Model rootModel = context.rootModel as Model
		
		for(statement : rootModel.spec){
			if(statement.def !== null){
				val String proposal = statement.def.name
				acceptor.accept(createCompletionProposal(proposal, context))
			} else if(statement.in !== null){
				val String proposal = statement.in.name
				acceptor.accept(createCompletionProposal(proposal, context))
			}
		}
	}
	
}
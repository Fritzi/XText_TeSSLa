/*
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.serializer;

import com.google.inject.Inject;
import de.uniluebeck.isp.tessla.services.TeSSLaGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class TeSSLaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TeSSLaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_definition_DefKeyword_0_0_or_DefineKeyword_0_1;
	protected AbstractElementAlias match_value_FalseKeyword_1_9_or_INTTerminalRuleCall_1_6_or_LeftParenthesisRightParenthesisKeyword_1_7_or_STRINGTerminalRuleCall_1_5_or_TrueKeyword_1_8;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TeSSLaGrammarAccess) access;
		match_definition_DefKeyword_0_0_or_DefineKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getDefKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getDefinitionAccess().getDefineKeyword_0_1()));
		match_value_FalseKeyword_1_9_or_INTTerminalRuleCall_1_6_or_LeftParenthesisRightParenthesisKeyword_1_7_or_STRINGTerminalRuleCall_1_5_or_TrueKeyword_1_8 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueAccess().getFalseKeyword_1_9()), new TokenAlias(false, false, grammarAccess.getValueAccess().getINTTerminalRuleCall_1_6()), new TokenAlias(false, false, grammarAccess.getValueAccess().getLeftParenthesisRightParenthesisKeyword_1_7()), new TokenAlias(false, false, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1_5()), new TokenAlias(false, false, grammarAccess.getValueAccess().getTrueKeyword_1_8()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_definition_DefKeyword_0_0_or_DefineKeyword_0_1.equals(syntax))
				emit_definition_DefKeyword_0_0_or_DefineKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_value_FalseKeyword_1_9_or_INTTerminalRuleCall_1_6_or_LeftParenthesisRightParenthesisKeyword_1_7_or_STRINGTerminalRuleCall_1_5_or_TrueKeyword_1_8.equals(syntax))
				emit_value_FalseKeyword_1_9_or_INTTerminalRuleCall_1_6_or_LeftParenthesisRightParenthesisKeyword_1_7_or_STRINGTerminalRuleCall_1_5_or_TrueKeyword_1_8(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'def' | 'define'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_definition_DefKeyword_0_0_or_DefineKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     STRING | '()' | 'true' | INT | 'false'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_value_FalseKeyword_1_9_or_INTTerminalRuleCall_1_6_or_LeftParenthesisRightParenthesisKeyword_1_7_or_STRINGTerminalRuleCall_1_5_or_TrueKeyword_1_8(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

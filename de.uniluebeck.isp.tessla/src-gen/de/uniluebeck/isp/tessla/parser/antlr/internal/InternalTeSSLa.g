/*
 * generated by Xtext 2.12.0
 */
grammar InternalTeSSLa;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package de.uniluebeck.isp.tessla.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.uniluebeck.isp.tessla.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uniluebeck.isp.tessla.services.TeSSLaGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TeSSLaGrammarAccess grammarAccess;

    public InternalTeSSLaParser(TokenStream input, TeSSLaGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected TeSSLaGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getSpecStatementParserRuleCall_0());
			}
			lv_spec_0_0=rulestatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"spec",
					lv_spec_0_0,
					"de.uniluebeck.isp.tessla.TeSSLa.statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRulestatement
entryRulestatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_rulestatement=rulestatement
	{ $current=$iv_rulestatement.current; }
	EOF;

// Rule statement
rulestatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getStatementAccess().getStatementAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getDefDefinitionParserRuleCall_1_0_0());
					}
					lv_def_1_0=ruledefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						set(
							$current,
							"def",
							lv_def_1_0,
							"de.uniluebeck.isp.tessla.TeSSLa.definition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getOutOutParserRuleCall_1_1_0());
					}
					lv_out_2_0=ruleout
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						set(
							$current,
							"out",
							lv_out_2_0,
							"de.uniluebeck.isp.tessla.TeSSLa.out");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getInInParserRuleCall_1_2_0());
					}
					lv_in_3_0=rulein
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						set(
							$current,
							"in",
							lv_in_3_0,
							"de.uniluebeck.isp.tessla.TeSSLa.in");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					lv_comment_4_0=RULE_SL_COMMENT
					{
						newLeafNode(lv_comment_4_0, grammarAccess.getStatementAccess().getCommentSL_COMMENTTerminalRuleCall_1_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStatementRule());
						}
						setWithLastConsumed(
							$current,
							"comment",
							lv_comment_4_0,
							"de.uniluebeck.isp.tessla.TeSSLa.SL_COMMENT");
					}
				)
			)
		)
	)
;

// Entry rule entryRuledefinition
entryRuledefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruledefinition=ruledefinition
	{ $current=$iv_ruledefinition.current; }
	EOF;

// Rule definition
ruledefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='def'
			{
				newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefKeyword_0_0());
			}
			    |
			otherlv_1='define'
			{
				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getDefineKeyword_0_1());
			}
		)
		(
			(
				lv_def_2_0=RULE_ID
				{
					newLeafNode(lv_def_2_0, grammarAccess.getDefinitionAccess().getDefIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"def",
						lv_def_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getParamListParamListParserRuleCall_2_0());
				}
				lv_paramList_3_0=ruleparamList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"paramList",
						lv_paramList_3_0,
						"de.uniluebeck.isp.tessla.TeSSLa.paramList");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_4=':'
			{
				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getColonKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_3_1_0());
					}
					lv_type_5_0=ruletype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"type",
							lv_type_5_0,
							"de.uniluebeck.isp.tessla.TeSSLa.type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6=':='
		{
			newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getColonEqualsSignKeyword_4());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionTypedExpressionParserRuleCall_5_0_0());
					}
					lv_expression_7_0=ruletypedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"expression",
							lv_expression_7_0,
							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_8='{'
				{
					newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_5_1_1_0());
						}
						lv_statements_9_0=rulestatement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDefinitionRule());
							}
							add(
								$current,
								"statements",
								lv_statements_9_0,
								"de.uniluebeck.isp.tessla.TeSSLa.statement");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				(
					(
						{
							newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_5_1_2_0());
						}
						lv_expression_10_0=ruleexpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDefinitionRule());
							}
							set(
								$current,
								"expression",
								lv_expression_10_0,
								"de.uniluebeck.isp.tessla.TeSSLa.expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_11='}'
				{
					newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_5_1_3());
				}
			)
		)
	)
;

// Entry rule entryRuleparamList
entryRuleparamList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParamListRule()); }
	iv_ruleparamList=ruleparamList
	{ $current=$iv_ruleparamList.current; }
	EOF;

// Rule paramList
ruleparamList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getParamListAccess().getParamListAction_0(),
					$current);
			}
		)
		(
			(
				otherlv_1='('
				{
					newLeafNode(otherlv_1, grammarAccess.getParamListAccess().getLeftParenthesisKeyword_1_0_0());
				}
				(
					(
						lv_params_2_0=RULE_ID
						{
							newLeafNode(lv_params_2_0, grammarAccess.getParamListAccess().getParamsIDTerminalRuleCall_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getParamListRule());
							}
							addWithLastConsumed(
								$current,
								"params",
								lv_params_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					otherlv_3=':'
					{
						newLeafNode(otherlv_3, grammarAccess.getParamListAccess().getColonKeyword_1_0_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getParamListAccess().getTypesTypeParserRuleCall_1_0_2_1_0());
							}
							lv_types_4_0=ruletype
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParamListRule());
								}
								add(
									$current,
									"types",
									lv_types_4_0,
									"de.uniluebeck.isp.tessla.TeSSLa.type");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
				(
					otherlv_5=','
					{
						newLeafNode(otherlv_5, grammarAccess.getParamListAccess().getCommaKeyword_1_0_3_0());
					}
					(
						(
							lv_params_6_0=RULE_ID
							{
								newLeafNode(lv_params_6_0, grammarAccess.getParamListAccess().getParamsIDTerminalRuleCall_1_0_3_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getParamListRule());
								}
								addWithLastConsumed(
									$current,
									"params",
									lv_params_6_0,
									"org.eclipse.xtext.common.Terminals.ID");
							}
						)
					)
					(
						otherlv_7=':'
						{
							newLeafNode(otherlv_7, grammarAccess.getParamListAccess().getColonKeyword_1_0_3_2_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getParamListAccess().getTypesTypeParserRuleCall_1_0_3_2_1_0());
								}
								lv_types_8_0=ruletype
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getParamListRule());
									}
									add(
										$current,
										"types",
										lv_types_8_0,
										"de.uniluebeck.isp.tessla.TeSSLa.type");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)?
				)*
				otherlv_9=')'
				{
					newLeafNode(otherlv_9, grammarAccess.getParamListAccess().getRightParenthesisKeyword_1_0_4());
				}
			)
			    |
			(
				otherlv_10='('
				{
					newLeafNode(otherlv_10, grammarAccess.getParamListAccess().getLeftParenthesisKeyword_1_1_0());
				}
				otherlv_11=')'
				{
					newLeafNode(otherlv_11, grammarAccess.getParamListAccess().getRightParenthesisKeyword_1_1_1());
				}
			)
		)
	)
;

// Entry rule entryRuleout
entryRuleout returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutRule()); }
	iv_ruleout=ruleout
	{ $current=$iv_ruleout.current; }
	EOF;

// Rule out
ruleout returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='out'
		{
			newLeafNode(otherlv_0, grammarAccess.getOutAccess().getOutKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOutAccess().getExpTypedExpressionParserRuleCall_1_0());
				}
				lv_exp_1_0=ruletypedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutRule());
					}
					set(
						$current,
						"exp",
						lv_exp_1_0,
						"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='as'
			{
				newLeafNode(otherlv_2, grammarAccess.getOutAccess().getAsKeyword_2_0());
			}
			(
				(
					lv_name_3_0=RULE_ID
					{
						newLeafNode(lv_name_3_0, grammarAccess.getOutAccess().getNameIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOutRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
	)
;

// Entry rule entryRulein
entryRulein returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInRule()); }
	iv_rulein=rulein
	{ $current=$iv_rulein.current; }
	EOF;

// Rule in
rulein returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='in'
		{
			newLeafNode(otherlv_0, grammarAccess.getInAccess().getInKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getInAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruletype
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"de.uniluebeck.isp.tessla.TeSSLa.type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuletypedExpression
entryRuletypedExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypedExpressionRule()); }
	iv_ruletypedExpression=ruletypedExpression
	{ $current=$iv_ruletypedExpression.current; }
	EOF;

// Rule typedExpression
ruletypedExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTypedExpressionAccess().getExpExpressionParserRuleCall_0_0());
				}
				lv_exp_0_0=ruleexpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypedExpressionRule());
					}
					set(
						$current,
						"exp",
						lv_exp_0_0,
						"de.uniluebeck.isp.tessla.TeSSLa.expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getTypedExpressionAccess().getColonKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTypedExpressionAccess().getTypeTypeParserRuleCall_1_1_0());
					}
					lv_type_2_0=ruletype
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypedExpressionRule());
						}
						set(
							$current,
							"type",
							lv_type_2_0,
							"de.uniluebeck.isp.tessla.TeSSLa.type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleexpression
entryRuleexpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleexpression=ruleexpression
	{ $current=$iv_ruleexpression.current; }
	EOF;

// Rule expression
ruleexpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='if'
			{
				newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getIfKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getIfTypedExpressionParserRuleCall_0_1_0());
					}
					lv_if_1_0=ruletypedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"if",
							lv_if_1_0,
							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_2='then'
			{
				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getThenKeyword_0_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getThenTypedExpressionParserRuleCall_0_3_0());
					}
					lv_then_3_0=ruletypedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"then",
							lv_then_3_0,
							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4='else'
				{
					newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getElseKeyword_0_4_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getExpressionAccess().getElseTypedExpressionParserRuleCall_0_4_1_0());
						}
						lv_else_5_0=ruletypedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExpressionRule());
							}
							set(
								$current,
								"else",
								lv_else_5_0,
								"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getValValueParserRuleCall_1_0_0());
					}
					lv_val_6_0=rulevalue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						add(
							$current,
							"val",
							lv_val_6_0,
							"de.uniluebeck.isp.tessla.TeSSLa.value");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getExpressionAccess().getInfixInfixOperatorParserRuleCall_1_1_0_0());
						}
						lv_infix_7_0=ruleinfixOperator
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExpressionRule());
							}
							add(
								$current,
								"infix",
								lv_infix_7_0,
								"de.uniluebeck.isp.tessla.TeSSLa.infixOperator");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getExpressionAccess().getValValueParserRuleCall_1_1_1_0());
						}
						lv_val_8_0=rulevalue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExpressionRule());
							}
							add(
								$current,
								"val",
								lv_val_8_0,
								"de.uniluebeck.isp.tessla.TeSSLa.value");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)
	)
;

// Entry rule entryRulevalue
entryRulevalue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_rulevalue=rulevalue
	{ $current=$iv_rulevalue.current; }
	EOF;

// Rule value
rulevalue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getValueAccess().getValueAction_0(),
					$current);
			}
		)
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getValueAccess().getOpUnaryOperatorParserRuleCall_1_0_0_0());
						}
						lv_op_1_0=ruleunaryOperator
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getValueRule());
							}
							set(
								$current,
								"op",
								lv_op_1_0,
								"de.uniluebeck.isp.tessla.TeSSLa.unaryOperator");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getValueAccess().getExpTypedExpressionParserRuleCall_1_0_1_0());
						}
						lv_exp_2_0=ruletypedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getValueRule());
							}
							set(
								$current,
								"exp",
								lv_exp_2_0,
								"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_3='('
				{
					newLeafNode(otherlv_3, grammarAccess.getValueAccess().getLeftParenthesisKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getValueAccess().getExpTypedExpressionParserRuleCall_1_1_1_0());
						}
						lv_exp_4_0=ruletypedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getValueRule());
							}
							set(
								$current,
								"exp",
								lv_exp_4_0,
								"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_5=')'
				{
					newLeafNode(otherlv_5, grammarAccess.getValueAccess().getRightParenthesisKeyword_1_1_2());
				}
			)
			    |
			(
				otherlv_6='{'
				{
					newLeafNode(otherlv_6, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getValueAccess().getStatementsStatementParserRuleCall_1_2_1_0());
						}
						lv_statements_7_0=rulestatement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getValueRule());
							}
							add(
								$current,
								"statements",
								lv_statements_7_0,
								"de.uniluebeck.isp.tessla.TeSSLa.statement");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				(
					(
						{
							newCompositeNode(grammarAccess.getValueAccess().getExpTypedExpressionParserRuleCall_1_2_2_0());
						}
						lv_exp_8_0=ruletypedExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getValueRule());
							}
							set(
								$current,
								"exp",
								lv_exp_8_0,
								"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_9='}'
				{
					newLeafNode(otherlv_9, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_1_2_3());
				}
			)
			    |
			(
				(
					(
						lv_name_10_0=RULE_ID
						{
							newLeafNode(lv_name_10_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_3_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getValueRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_10_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				otherlv_11='('
				{
					newLeafNode(otherlv_11, grammarAccess.getValueAccess().getLeftParenthesisKeyword_1_3_1());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_0_0());
							}
							lv_args_12_0=rulearg
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getValueRule());
								}
								add(
									$current,
									"args",
									lv_args_12_0,
									"de.uniluebeck.isp.tessla.TeSSLa.arg");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_13=','
						{
							newLeafNode(otherlv_13, grammarAccess.getValueAccess().getCommaKeyword_1_3_2_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_1_1_0());
								}
								lv_args_14_0=rulearg
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getValueRule());
									}
									add(
										$current,
										"args",
										lv_args_14_0,
										"de.uniluebeck.isp.tessla.TeSSLa.arg");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_15=')'
				{
					newLeafNode(otherlv_15, grammarAccess.getValueAccess().getRightParenthesisKeyword_1_3_3());
				}
			)
			    |
			(
				(
					lv_name_16_0=RULE_ID
					{
						newLeafNode(lv_name_16_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getValueRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_16_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					lv_name_17_0=RULE_STRING
					{
						newLeafNode(lv_name_17_0, grammarAccess.getValueAccess().getNameSTRINGTerminalRuleCall_1_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getValueRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_17_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			    |
			(
				(
					lv_val_18_0=RULE_INT
					{
						newLeafNode(lv_val_18_0, grammarAccess.getValueAccess().getValINTTerminalRuleCall_1_6_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getValueRule());
						}
						setWithLastConsumed(
							$current,
							"val",
							lv_val_18_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			    |
			otherlv_19='()'
			{
				newLeafNode(otherlv_19, grammarAccess.getValueAccess().getLeftParenthesisRightParenthesisKeyword_1_7());
			}
			    |
			otherlv_20='true'
			{
				newLeafNode(otherlv_20, grammarAccess.getValueAccess().getTrueKeyword_1_8());
			}
			    |
			otherlv_21='false'
			{
				newLeafNode(otherlv_21, grammarAccess.getValueAccess().getFalseKeyword_1_9());
			}
		)
	)
;

// Entry rule entryRulearg
entryRulearg returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArgRule()); }
	iv_rulearg=rulearg
	{ $current=$iv_rulearg.current; }
	EOF;

// Rule arg
rulearg returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_arg_0_0=RULE_ID
					{
						newLeafNode(lv_arg_0_0, grammarAccess.getArgAccess().getArgIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getArgRule());
						}
						setWithLastConsumed(
							$current,
							"arg",
							lv_arg_0_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_1='='
			{
				newLeafNode(otherlv_1, grammarAccess.getArgAccess().getEqualsSignKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArgAccess().getExpTypedExpressionParserRuleCall_0_2_0());
					}
					lv_exp_2_0=ruletypedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArgRule());
						}
						set(
							$current,
							"exp",
							lv_exp_2_0,
							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getArgAccess().getExpTypedExpressionParserRuleCall_1_0());
				}
				lv_exp_3_0=ruletypedExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArgRule());
					}
					set(
						$current,
						"exp",
						lv_exp_3_0,
						"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuletype
entryRuletype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruletype=ruletype
	{ $current=$iv_ruletype.current.getText(); }
	EOF;

// Rule type
ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getTypeAccess().getIDTerminalRuleCall_0_0());
			}
			kw='<'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getLessThanSignKeyword_0_1());
			}
			{
				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_0_2());
			}
			this_type_2=ruletype
			{
				$current.merge(this_type_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
			(
				kw=','
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getTypeAccess().getCommaKeyword_0_3_0());
				}
				{
					newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_0_3_1());
				}
				this_type_4=ruletype
				{
					$current.merge(this_type_4);
				}
				{
					afterParserOrEnumRuleCall();
				}
			)*
			kw='>'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_0_4());
			}
		)
		    |
		this_ID_6=RULE_ID
		{
			$current.merge(this_ID_6);
		}
		{
			newLeafNode(this_ID_6, grammarAccess.getTypeAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleinfixOperator
entryRuleinfixOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInfixOperatorRule()); }
	iv_ruleinfixOperator=ruleinfixOperator
	{ $current=$iv_ruleinfixOperator.current.getText(); }
	EOF;

// Rule infixOperator
ruleinfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='%'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getPercentSignKeyword_0());
		}
		    |
		kw='<<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignLessThanSignKeyword_1());
		}
		    |
		kw='>>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_2());
		}
		    |
		kw='>='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
		}
		    |
		kw='<='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignEqualsSignKeyword_4());
		}
		    |
		kw='<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignKeyword_5());
		}
		    |
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignKeyword_6());
		}
		    |
		kw='!='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getExclamationMarkEqualsSignKeyword_7());
		}
		    |
		kw='=='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getEqualsSignEqualsSignKeyword_8());
		}
		    |
		kw='&'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAmpersandKeyword_9());
		}
		    |
		kw='|'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getVerticalLineKeyword_10());
		}
		    |
		kw='^'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getCircumflexAccentKeyword_11());
		}
		    |
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getPlusSignKeyword_12());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getHyphenMinusKeyword_13());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAsteriskKeyword_14());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getSolidusKeyword_15());
		}
		    |
		kw='&&'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAmpersandAmpersandKeyword_16());
		}
		    |
		kw='||'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getVerticalLineVerticalLineKeyword_17());
		}
	)
;

// Entry rule entryRuleunaryOperator
entryRuleunaryOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUnaryOperatorRule()); }
	iv_ruleunaryOperator=ruleunaryOperator
	{ $current=$iv_ruleunaryOperator.current.getText(); }
	EOF;

// Rule unaryOperator
ruleunaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='~'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
		}
		    |
		kw='!'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
		}
	)
;

RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

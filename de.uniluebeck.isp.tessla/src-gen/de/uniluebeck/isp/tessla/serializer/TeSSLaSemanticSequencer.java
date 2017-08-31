/*
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.serializer;

import com.google.inject.Inject;
import de.uniluebeck.isp.tessla.services.TeSSLaGrammarAccess;
import de.uniluebeck.isp.tessla.teSSLa.Model;
import de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage;
import de.uniluebeck.isp.tessla.teSSLa.arg;
import de.uniluebeck.isp.tessla.teSSLa.definition;
import de.uniluebeck.isp.tessla.teSSLa.expression;
import de.uniluebeck.isp.tessla.teSSLa.in;
import de.uniluebeck.isp.tessla.teSSLa.out;
import de.uniluebeck.isp.tessla.teSSLa.paramList;
import de.uniluebeck.isp.tessla.teSSLa.statement;
import de.uniluebeck.isp.tessla.teSSLa.typedExpression;
import de.uniluebeck.isp.tessla.teSSLa.value;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TeSSLaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TeSSLaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TeSSLaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TeSSLaPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TeSSLaPackage.ARG:
				sequence_arg(context, (arg) semanticObject); 
				return; 
			case TeSSLaPackage.DEFINITION:
				sequence_definition(context, (definition) semanticObject); 
				return; 
			case TeSSLaPackage.EXPRESSION:
				sequence_expression(context, (expression) semanticObject); 
				return; 
			case TeSSLaPackage.IN:
				sequence_in(context, (in) semanticObject); 
				return; 
			case TeSSLaPackage.OUT:
				sequence_out(context, (out) semanticObject); 
				return; 
			case TeSSLaPackage.PARAM_LIST:
				sequence_paramList(context, (paramList) semanticObject); 
				return; 
			case TeSSLaPackage.STATEMENT:
				sequence_statement(context, (statement) semanticObject); 
				return; 
			case TeSSLaPackage.TYPED_EXPRESSION:
				sequence_typedExpression(context, (typedExpression) semanticObject); 
				return; 
			case TeSSLaPackage.VALUE:
				sequence_value(context, (value) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     spec+=statement+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     arg returns arg
	 *
	 * Constraint:
	 *     ((arg=ID exp=typedExpression) | exp=typedExpression)
	 */
	protected void sequence_arg(ISerializationContext context, arg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     definition returns definition
	 *
	 * Constraint:
	 *     (def=ID paramList=paramList? type=type? (expression=typedExpression | (statements+=statement* expression=expression)))
	 */
	protected void sequence_definition(ISerializationContext context, definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     expression returns expression
	 *
	 * Constraint:
	 *     ((if=typedExpression then=typedExpression else=typedExpression?) | (val+=value (infix+=infixOperator val+=value)*))
	 */
	protected void sequence_expression(ISerializationContext context, expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     in returns in
	 *
	 * Constraint:
	 *     (name=ID type=type)
	 */
	protected void sequence_in(ISerializationContext context, in semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TeSSLaPackage.Literals.IN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TeSSLaPackage.Literals.IN__NAME));
			if (transientValues.isValueTransient(semanticObject, TeSSLaPackage.Literals.IN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TeSSLaPackage.Literals.IN__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInAccess().getTypeTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     out returns out
	 *
	 * Constraint:
	 *     (exp=typedExpression name=ID?)
	 */
	protected void sequence_out(ISerializationContext context, out semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     paramList returns paramList
	 *
	 * Constraint:
	 *     (params+=ID types+=type? (params+=ID types+=type?)*)?
	 */
	protected void sequence_paramList(ISerializationContext context, paramList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     statement returns statement
	 *
	 * Constraint:
	 *     (def=definition | out=out | in=in | comment=SL_COMMENT)
	 */
	protected void sequence_statement(ISerializationContext context, statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     typedExpression returns typedExpression
	 *
	 * Constraint:
	 *     (exp=expression type=type?)
	 */
	protected void sequence_typedExpression(ISerializationContext context, typedExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     value returns value
	 *
	 * Constraint:
	 *     (
	 *         (op=unaryOperator exp=typedExpression) | 
	 *         exp=typedExpression | 
	 *         (statements+=statement* exp=typedExpression) | 
	 *         (name=ID (args+=arg args+=arg*)?) | 
	 *         name=ID | 
	 *         name=STRING | 
	 *         val=INT
	 *     )?
	 */
	protected void sequence_value(ISerializationContext context, value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

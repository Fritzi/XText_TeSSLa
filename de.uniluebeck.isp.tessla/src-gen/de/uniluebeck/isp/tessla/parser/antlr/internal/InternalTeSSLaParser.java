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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTeSSLaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'define'", "':'", "':='", "'{'", "'}'", "'('", "','", "')'", "'out'", "'as'", "'in'", "'if'", "'then'", "'else'", "'()'", "'true'", "'false'", "'='", "'<'", "'>'", "'%'", "'<<'", "'>>'", "'>='", "'<='", "'!='", "'=='", "'&'", "'|'", "'^'", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'~'", "'!'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTeSSLaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTeSSLaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTeSSLaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTeSSLa.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalTeSSLa.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTeSSLa.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalTeSSLa.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTeSSLa.g:77:1: ruleModel returns [EObject current=null] : ( (lv_spec_0_0= rulestatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_spec_0_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:83:2: ( ( (lv_spec_0_0= rulestatement ) )* )
            // InternalTeSSLa.g:84:2: ( (lv_spec_0_0= rulestatement ) )*
            {
            // InternalTeSSLa.g:84:2: ( (lv_spec_0_0= rulestatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SL_COMMENT||(LA1_0>=11 && LA1_0<=12)||LA1_0==20||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTeSSLa.g:85:3: (lv_spec_0_0= rulestatement )
            	    {
            	    // InternalTeSSLa.g:85:3: (lv_spec_0_0= rulestatement )
            	    // InternalTeSSLa.g:86:4: lv_spec_0_0= rulestatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getSpecStatementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_spec_0_0=rulestatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"spec",
            	      					lv_spec_0_0,
            	      					"de.uniluebeck.isp.tessla.TeSSLa.statement");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulestatement"
    // InternalTeSSLa.g:106:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalTeSSLa.g:106:50: (iv_rulestatement= rulestatement EOF )
            // InternalTeSSLa.g:107:2: iv_rulestatement= rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalTeSSLa.g:113:1: rulestatement returns [EObject current=null] : ( () ( ( (lv_def_1_0= ruledefinition ) ) | ( (lv_out_2_0= ruleout ) ) | ( (lv_in_3_0= rulein ) ) | ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token lv_comment_4_0=null;
        EObject lv_def_1_0 = null;

        EObject lv_out_2_0 = null;

        EObject lv_in_3_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:119:2: ( ( () ( ( (lv_def_1_0= ruledefinition ) ) | ( (lv_out_2_0= ruleout ) ) | ( (lv_in_3_0= rulein ) ) | ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ) )
            // InternalTeSSLa.g:120:2: ( () ( ( (lv_def_1_0= ruledefinition ) ) | ( (lv_out_2_0= ruleout ) ) | ( (lv_in_3_0= rulein ) ) | ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            {
            // InternalTeSSLa.g:120:2: ( () ( ( (lv_def_1_0= ruledefinition ) ) | ( (lv_out_2_0= ruleout ) ) | ( (lv_in_3_0= rulein ) ) | ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) )
            // InternalTeSSLa.g:121:3: () ( ( (lv_def_1_0= ruledefinition ) ) | ( (lv_out_2_0= ruleout ) ) | ( (lv_in_3_0= rulein ) ) | ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            {
            // InternalTeSSLa.g:121:3: ()
            // InternalTeSSLa.g:122:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStatementAccess().getStatementAction_0(),
              					current);
              			
            }

            }

            // InternalTeSSLa.g:131:3: ( ( (lv_def_1_0= ruledefinition ) ) | ( (lv_out_2_0= ruleout ) ) | ( (lv_in_3_0= rulein ) ) | ( (lv_comment_4_0= RULE_SL_COMMENT ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTeSSLa.g:132:4: ( (lv_def_1_0= ruledefinition ) )
                    {
                    // InternalTeSSLa.g:132:4: ( (lv_def_1_0= ruledefinition ) )
                    // InternalTeSSLa.g:133:5: (lv_def_1_0= ruledefinition )
                    {
                    // InternalTeSSLa.g:133:5: (lv_def_1_0= ruledefinition )
                    // InternalTeSSLa.g:134:6: lv_def_1_0= ruledefinition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getDefDefinitionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_def_1_0=ruledefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"def",
                      							lv_def_1_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.definition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:152:4: ( (lv_out_2_0= ruleout ) )
                    {
                    // InternalTeSSLa.g:152:4: ( (lv_out_2_0= ruleout ) )
                    // InternalTeSSLa.g:153:5: (lv_out_2_0= ruleout )
                    {
                    // InternalTeSSLa.g:153:5: (lv_out_2_0= ruleout )
                    // InternalTeSSLa.g:154:6: lv_out_2_0= ruleout
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getOutOutParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_out_2_0=ruleout();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"out",
                      							lv_out_2_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.out");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:172:4: ( (lv_in_3_0= rulein ) )
                    {
                    // InternalTeSSLa.g:172:4: ( (lv_in_3_0= rulein ) )
                    // InternalTeSSLa.g:173:5: (lv_in_3_0= rulein )
                    {
                    // InternalTeSSLa.g:173:5: (lv_in_3_0= rulein )
                    // InternalTeSSLa.g:174:6: lv_in_3_0= rulein
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getInInParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_in_3_0=rulein();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"in",
                      							lv_in_3_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.in");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTeSSLa.g:192:4: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
                    {
                    // InternalTeSSLa.g:192:4: ( (lv_comment_4_0= RULE_SL_COMMENT ) )
                    // InternalTeSSLa.g:193:5: (lv_comment_4_0= RULE_SL_COMMENT )
                    {
                    // InternalTeSSLa.g:193:5: (lv_comment_4_0= RULE_SL_COMMENT )
                    // InternalTeSSLa.g:194:6: lv_comment_4_0= RULE_SL_COMMENT
                    {
                    lv_comment_4_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_comment_4_0, grammarAccess.getStatementAccess().getCommentSL_COMMENTTerminalRuleCall_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStatementRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"comment",
                      							lv_comment_4_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.SL_COMMENT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuledefinition"
    // InternalTeSSLa.g:215:1: entryRuledefinition returns [EObject current=null] : iv_ruledefinition= ruledefinition EOF ;
    public final EObject entryRuledefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledefinition = null;


        try {
            // InternalTeSSLa.g:215:51: (iv_ruledefinition= ruledefinition EOF )
            // InternalTeSSLa.g:216:2: iv_ruledefinition= ruledefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruledefinition=ruledefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledefinition"


    // $ANTLR start "ruledefinition"
    // InternalTeSSLa.g:222:1: ruledefinition returns [EObject current=null] : ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruletypedExpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) ) ) ;
    public final EObject ruledefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_def_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_paramList_3_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_statements_9_0 = null;

        EObject lv_expression_10_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:228:2: ( ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruletypedExpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) ) ) )
            // InternalTeSSLa.g:229:2: ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruletypedExpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) ) )
            {
            // InternalTeSSLa.g:229:2: ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruletypedExpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) ) )
            // InternalTeSSLa.g:230:3: (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruletypedExpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) )
            {
            // InternalTeSSLa.g:230:3: (otherlv_0= 'def' | otherlv_1= 'define' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTeSSLa.g:231:4: otherlv_0= 'def'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:236:4: otherlv_1= 'define'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getDefineKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalTeSSLa.g:241:3: ( (lv_def_2_0= RULE_ID ) )
            // InternalTeSSLa.g:242:4: (lv_def_2_0= RULE_ID )
            {
            // InternalTeSSLa.g:242:4: (lv_def_2_0= RULE_ID )
            // InternalTeSSLa.g:243:5: lv_def_2_0= RULE_ID
            {
            lv_def_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_def_2_0, grammarAccess.getDefinitionAccess().getDefIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"def",
              						lv_def_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalTeSSLa.g:259:3: ( (lv_paramList_3_0= ruleparamList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTeSSLa.g:260:4: (lv_paramList_3_0= ruleparamList )
                    {
                    // InternalTeSSLa.g:260:4: (lv_paramList_3_0= ruleparamList )
                    // InternalTeSSLa.g:261:5: lv_paramList_3_0= ruleparamList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefinitionAccess().getParamListParamListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
                    lv_paramList_3_0=ruleparamList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"paramList",
                      						lv_paramList_3_0,
                      						"de.uniluebeck.isp.tessla.TeSSLa.paramList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTeSSLa.g:278:3: (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTeSSLa.g:279:4: otherlv_4= ':' ( (lv_type_5_0= ruletype ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getColonKeyword_3_0());
                      			
                    }
                    // InternalTeSSLa.g:283:4: ( (lv_type_5_0= ruletype ) )
                    // InternalTeSSLa.g:284:5: (lv_type_5_0= ruletype )
                    {
                    // InternalTeSSLa.g:284:5: (lv_type_5_0= ruletype )
                    // InternalTeSSLa.g:285:6: lv_type_5_0= ruletype
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_type_5_0=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_5_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getColonEqualsSignKeyword_4());
              		
            }
            // InternalTeSSLa.g:307:3: ( ( (lv_expression_7_0= ruletypedExpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalTeSSLa.g:308:4: ( (lv_expression_7_0= ruletypedExpression ) )
                    {
                    // InternalTeSSLa.g:308:4: ( (lv_expression_7_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:309:5: (lv_expression_7_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:309:5: (lv_expression_7_0= ruletypedExpression )
                    // InternalTeSSLa.g:310:6: lv_expression_7_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionTypedExpressionParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_7_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_7_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:328:4: (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' )
                    {
                    // InternalTeSSLa.g:328:4: (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' )
                    // InternalTeSSLa.g:329:5: otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalTeSSLa.g:333:5: ( (lv_statements_9_0= rulestatement ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_SL_COMMENT||(LA6_0>=11 && LA6_0<=12)||LA6_0==20||LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTeSSLa.g:334:6: (lv_statements_9_0= rulestatement )
                    	    {
                    	    // InternalTeSSLa.g:334:6: (lv_statements_9_0= rulestatement )
                    	    // InternalTeSSLa.g:335:7: lv_statements_9_0= rulestatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_statements_9_0=rulestatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"statements",
                    	      								lv_statements_9_0,
                    	      								"de.uniluebeck.isp.tessla.TeSSLa.statement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalTeSSLa.g:352:5: ( (lv_expression_10_0= ruleexpression ) )
                    // InternalTeSSLa.g:353:6: (lv_expression_10_0= ruleexpression )
                    {
                    // InternalTeSSLa.g:353:6: (lv_expression_10_0= ruleexpression )
                    // InternalTeSSLa.g:354:7: lv_expression_10_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_5_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_10);
                    lv_expression_10_0=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      							}
                      							set(
                      								current,
                      								"expression",
                      								lv_expression_10_0,
                      								"de.uniluebeck.isp.tessla.TeSSLa.expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_5_1_3());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledefinition"


    // $ANTLR start "entryRuleparamList"
    // InternalTeSSLa.g:381:1: entryRuleparamList returns [EObject current=null] : iv_ruleparamList= ruleparamList EOF ;
    public final EObject entryRuleparamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparamList = null;


        try {
            // InternalTeSSLa.g:381:50: (iv_ruleparamList= ruleparamList EOF )
            // InternalTeSSLa.g:382:2: iv_ruleparamList= ruleparamList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleparamList=ruleparamList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparamList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparamList"


    // $ANTLR start "ruleparamList"
    // InternalTeSSLa.g:388:1: ruleparamList returns [EObject current=null] : ( () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) ) ) ;
    public final EObject ruleparamList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_params_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_params_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_types_4_0 = null;

        AntlrDatatypeRuleToken lv_types_8_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:394:2: ( ( () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) ) ) )
            // InternalTeSSLa.g:395:2: ( () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) ) )
            {
            // InternalTeSSLa.g:395:2: ( () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) ) )
            // InternalTeSSLa.g:396:3: () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) )
            {
            // InternalTeSSLa.g:396:3: ()
            // InternalTeSSLa.g:397:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParamListAccess().getParamListAction_0(),
              					current);
              			
            }

            }

            // InternalTeSSLa.g:406:3: ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    alt11=1;
                }
                else if ( (LA11_1==19) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTeSSLa.g:407:4: (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' )
                    {
                    // InternalTeSSLa.g:407:4: (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' )
                    // InternalTeSSLa.g:408:5: otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getParamListAccess().getLeftParenthesisKeyword_1_0_0());
                      				
                    }
                    // InternalTeSSLa.g:412:5: ( (lv_params_2_0= RULE_ID ) )
                    // InternalTeSSLa.g:413:6: (lv_params_2_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:413:6: (lv_params_2_0= RULE_ID )
                    // InternalTeSSLa.g:414:7: lv_params_2_0= RULE_ID
                    {
                    lv_params_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_params_2_0, grammarAccess.getParamListAccess().getParamsIDTerminalRuleCall_1_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getParamListRule());
                      							}
                      							addWithLastConsumed(
                      								current,
                      								"params",
                      								lv_params_2_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }

                    // InternalTeSSLa.g:430:5: (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==13) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalTeSSLa.g:431:6: otherlv_3= ':' ( (lv_types_4_0= ruletype ) )
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getParamListAccess().getColonKeyword_1_0_2_0());
                              					
                            }
                            // InternalTeSSLa.g:435:6: ( (lv_types_4_0= ruletype ) )
                            // InternalTeSSLa.g:436:7: (lv_types_4_0= ruletype )
                            {
                            // InternalTeSSLa.g:436:7: (lv_types_4_0= ruletype )
                            // InternalTeSSLa.g:437:8: lv_types_4_0= ruletype
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParamListAccess().getTypesTypeParserRuleCall_1_0_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_12);
                            lv_types_4_0=ruletype();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getParamListRule());
                              								}
                              								add(
                              									current,
                              									"types",
                              									lv_types_4_0,
                              									"de.uniluebeck.isp.tessla.TeSSLa.type");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalTeSSLa.g:455:5: (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTeSSLa.g:456:6: otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )?
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getParamListAccess().getCommaKeyword_1_0_3_0());
                    	      					
                    	    }
                    	    // InternalTeSSLa.g:460:6: ( (lv_params_6_0= RULE_ID ) )
                    	    // InternalTeSSLa.g:461:7: (lv_params_6_0= RULE_ID )
                    	    {
                    	    // InternalTeSSLa.g:461:7: (lv_params_6_0= RULE_ID )
                    	    // InternalTeSSLa.g:462:8: lv_params_6_0= RULE_ID
                    	    {
                    	    lv_params_6_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								newLeafNode(lv_params_6_0, grammarAccess.getParamListAccess().getParamsIDTerminalRuleCall_1_0_3_1_0());
                    	      							
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElement(grammarAccess.getParamListRule());
                    	      								}
                    	      								addWithLastConsumed(
                    	      									current,
                    	      									"params",
                    	      									lv_params_6_0,
                    	      									"org.eclipse.xtext.common.Terminals.ID");
                    	      							
                    	    }

                    	    }


                    	    }

                    	    // InternalTeSSLa.g:478:6: (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==13) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalTeSSLa.g:479:7: otherlv_7= ':' ( (lv_types_8_0= ruletype ) )
                    	            {
                    	            otherlv_7=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_7, grammarAccess.getParamListAccess().getColonKeyword_1_0_3_2_0());
                    	              						
                    	            }
                    	            // InternalTeSSLa.g:483:7: ( (lv_types_8_0= ruletype ) )
                    	            // InternalTeSSLa.g:484:8: (lv_types_8_0= ruletype )
                    	            {
                    	            // InternalTeSSLa.g:484:8: (lv_types_8_0= ruletype )
                    	            // InternalTeSSLa.g:485:9: lv_types_8_0= ruletype
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              									newCompositeNode(grammarAccess.getParamListAccess().getTypesTypeParserRuleCall_1_0_3_2_1_0());
                    	              								
                    	            }
                    	            pushFollow(FOLLOW_12);
                    	            lv_types_8_0=ruletype();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              									if (current==null) {
                    	              										current = createModelElementForParent(grammarAccess.getParamListRule());
                    	              									}
                    	              									add(
                    	              										current,
                    	              										"types",
                    	              										lv_types_8_0,
                    	              										"de.uniluebeck.isp.tessla.TeSSLa.type");
                    	              									afterParserOrEnumRuleCall();
                    	              								
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getParamListAccess().getRightParenthesisKeyword_1_0_4());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:510:4: (otherlv_10= '(' otherlv_11= ')' )
                    {
                    // InternalTeSSLa.g:510:4: (otherlv_10= '(' otherlv_11= ')' )
                    // InternalTeSSLa.g:511:5: otherlv_10= '(' otherlv_11= ')'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getParamListAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    otherlv_11=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getParamListAccess().getRightParenthesisKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparamList"


    // $ANTLR start "entryRuleout"
    // InternalTeSSLa.g:525:1: entryRuleout returns [EObject current=null] : iv_ruleout= ruleout EOF ;
    public final EObject entryRuleout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleout = null;


        try {
            // InternalTeSSLa.g:525:44: (iv_ruleout= ruleout EOF )
            // InternalTeSSLa.g:526:2: iv_ruleout= ruleout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleout=ruleout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleout; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleout"


    // $ANTLR start "ruleout"
    // InternalTeSSLa.g:532:1: ruleout returns [EObject current=null] : (otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:538:2: ( (otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // InternalTeSSLa.g:539:2: (otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // InternalTeSSLa.g:539:2: (otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // InternalTeSSLa.g:540:3: otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOutAccess().getOutKeyword_0());
              		
            }
            // InternalTeSSLa.g:544:3: ( (lv_exp_1_0= ruletypedExpression ) )
            // InternalTeSSLa.g:545:4: (lv_exp_1_0= ruletypedExpression )
            {
            // InternalTeSSLa.g:545:4: (lv_exp_1_0= ruletypedExpression )
            // InternalTeSSLa.g:546:5: lv_exp_1_0= ruletypedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOutAccess().getExpTypedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_exp_1_0=ruletypedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOutRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_1_0,
              						"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTeSSLa.g:563:3: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTeSSLa.g:564:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOutAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalTeSSLa.g:568:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalTeSSLa.g:569:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:569:5: (lv_name_3_0= RULE_ID )
                    // InternalTeSSLa.g:570:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_3_0, grammarAccess.getOutAccess().getNameIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOutRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_3_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleout"


    // $ANTLR start "entryRulein"
    // InternalTeSSLa.g:591:1: entryRulein returns [EObject current=null] : iv_rulein= rulein EOF ;
    public final EObject entryRulein() throws RecognitionException {
        EObject current = null;

        EObject iv_rulein = null;


        try {
            // InternalTeSSLa.g:591:43: (iv_rulein= rulein EOF )
            // InternalTeSSLa.g:592:2: iv_rulein= rulein EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulein=rulein();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulein; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulein"


    // $ANTLR start "rulein"
    // InternalTeSSLa.g:598:1: rulein returns [EObject current=null] : (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) ) ;
    public final EObject rulein() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:604:2: ( (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) ) )
            // InternalTeSSLa.g:605:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )
            {
            // InternalTeSSLa.g:605:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )
            // InternalTeSSLa.g:606:3: otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInAccess().getInKeyword_0());
              		
            }
            // InternalTeSSLa.g:610:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTeSSLa.g:611:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTeSSLa.g:611:4: (lv_name_1_0= RULE_ID )
            // InternalTeSSLa.g:612:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getInAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInAccess().getColonKeyword_2());
              		
            }
            // InternalTeSSLa.g:632:3: ( (lv_type_3_0= ruletype ) )
            // InternalTeSSLa.g:633:4: (lv_type_3_0= ruletype )
            {
            // InternalTeSSLa.g:633:4: (lv_type_3_0= ruletype )
            // InternalTeSSLa.g:634:5: lv_type_3_0= ruletype
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInAccess().getTypeTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"de.uniluebeck.isp.tessla.TeSSLa.type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulein"


    // $ANTLR start "entryRuletypedExpression"
    // InternalTeSSLa.g:655:1: entryRuletypedExpression returns [EObject current=null] : iv_ruletypedExpression= ruletypedExpression EOF ;
    public final EObject entryRuletypedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypedExpression = null;


        try {
            // InternalTeSSLa.g:655:56: (iv_ruletypedExpression= ruletypedExpression EOF )
            // InternalTeSSLa.g:656:2: iv_ruletypedExpression= ruletypedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletypedExpression=ruletypedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletypedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletypedExpression"


    // $ANTLR start "ruletypedExpression"
    // InternalTeSSLa.g:662:1: ruletypedExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )? ) ;
    public final EObject ruletypedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:668:2: ( ( ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )? ) )
            // InternalTeSSLa.g:669:2: ( ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )? )
            {
            // InternalTeSSLa.g:669:2: ( ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )? )
            // InternalTeSSLa.g:670:3: ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )?
            {
            // InternalTeSSLa.g:670:3: ( (lv_exp_0_0= ruleexpression ) )
            // InternalTeSSLa.g:671:4: (lv_exp_0_0= ruleexpression )
            {
            // InternalTeSSLa.g:671:4: (lv_exp_0_0= ruleexpression )
            // InternalTeSSLa.g:672:5: lv_exp_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedExpressionAccess().getExpExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_exp_0_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedExpressionRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_0_0,
              						"de.uniluebeck.isp.tessla.TeSSLa.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTeSSLa.g:689:3: (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred15_InternalTeSSLa()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalTeSSLa.g:690:4: otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypedExpressionAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalTeSSLa.g:694:4: ( (lv_type_2_0= ruletype ) )
                    // InternalTeSSLa.g:695:5: (lv_type_2_0= ruletype )
                    {
                    // InternalTeSSLa.g:695:5: (lv_type_2_0= ruletype )
                    // InternalTeSSLa.g:696:6: lv_type_2_0= ruletype
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedExpressionAccess().getTypeTypeParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypedExpressionRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletypedExpression"


    // $ANTLR start "entryRuleexpression"
    // InternalTeSSLa.g:718:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalTeSSLa.g:718:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalTeSSLa.g:719:2: iv_ruleexpression= ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalTeSSLa.g:725:1: ruleexpression returns [EObject current=null] : ( (otherlv_0= 'if' ( (lv_if_1_0= ruletypedExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruletypedExpression ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) ) )? ) | ( ( (lv_val_6_0= rulevalue ) ) ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )* ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_if_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;

        EObject lv_val_6_0 = null;

        AntlrDatatypeRuleToken lv_infix_7_0 = null;

        EObject lv_val_8_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:731:2: ( ( (otherlv_0= 'if' ( (lv_if_1_0= ruletypedExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruletypedExpression ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) ) )? ) | ( ( (lv_val_6_0= rulevalue ) ) ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )* ) ) )
            // InternalTeSSLa.g:732:2: ( (otherlv_0= 'if' ( (lv_if_1_0= ruletypedExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruletypedExpression ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) ) )? ) | ( ( (lv_val_6_0= rulevalue ) ) ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )* ) )
            {
            // InternalTeSSLa.g:732:2: ( (otherlv_0= 'if' ( (lv_if_1_0= ruletypedExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruletypedExpression ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) ) )? ) | ( ( (lv_val_6_0= rulevalue ) ) ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )* ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==15||LA16_0==17||(LA16_0>=26 && LA16_0<=28)||LA16_0==43||(LA16_0>=48 && LA16_0<=49)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTeSSLa.g:733:3: (otherlv_0= 'if' ( (lv_if_1_0= ruletypedExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruletypedExpression ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) ) )? )
                    {
                    // InternalTeSSLa.g:733:3: (otherlv_0= 'if' ( (lv_if_1_0= ruletypedExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruletypedExpression ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) ) )? )
                    // InternalTeSSLa.g:734:4: otherlv_0= 'if' ( (lv_if_1_0= ruletypedExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruletypedExpression ) ) (otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) ) )?
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getIfKeyword_0_0());
                      			
                    }
                    // InternalTeSSLa.g:738:4: ( (lv_if_1_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:739:5: (lv_if_1_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:739:5: (lv_if_1_0= ruletypedExpression )
                    // InternalTeSSLa.g:740:6: lv_if_1_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getIfTypedExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_if_1_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"if",
                      							lv_if_1_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getThenKeyword_0_2());
                      			
                    }
                    // InternalTeSSLa.g:761:4: ( (lv_then_3_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:762:5: (lv_then_3_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:762:5: (lv_then_3_0= ruletypedExpression )
                    // InternalTeSSLa.g:763:6: lv_then_3_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getThenTypedExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_then_3_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"then",
                      							lv_then_3_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTeSSLa.g:780:4: (otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred16_InternalTeSSLa()) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalTeSSLa.g:781:5: otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) )
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getElseKeyword_0_4_0());
                              				
                            }
                            // InternalTeSSLa.g:785:5: ( (lv_else_5_0= ruletypedExpression ) )
                            // InternalTeSSLa.g:786:6: (lv_else_5_0= ruletypedExpression )
                            {
                            // InternalTeSSLa.g:786:6: (lv_else_5_0= ruletypedExpression )
                            // InternalTeSSLa.g:787:7: lv_else_5_0= ruletypedExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpressionAccess().getElseTypedExpressionParserRuleCall_0_4_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_else_5_0=ruletypedExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpressionRule());
                              							}
                              							set(
                              								current,
                              								"else",
                              								lv_else_5_0,
                              								"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:807:3: ( ( (lv_val_6_0= rulevalue ) ) ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )* )
                    {
                    // InternalTeSSLa.g:807:3: ( ( (lv_val_6_0= rulevalue ) ) ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )* )
                    // InternalTeSSLa.g:808:4: ( (lv_val_6_0= rulevalue ) ) ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )*
                    {
                    // InternalTeSSLa.g:808:4: ( (lv_val_6_0= rulevalue ) )
                    // InternalTeSSLa.g:809:5: (lv_val_6_0= rulevalue )
                    {
                    // InternalTeSSLa.g:809:5: (lv_val_6_0= rulevalue )
                    // InternalTeSSLa.g:810:6: lv_val_6_0= rulevalue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getValValueParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_val_6_0=rulevalue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						add(
                      							current,
                      							"val",
                      							lv_val_6_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTeSSLa.g:827:4: ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        alt15 = dfa15.predict(input);
                        switch (alt15) {
                    	case 1 :
                    	    // InternalTeSSLa.g:828:5: ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) )
                    	    {
                    	    // InternalTeSSLa.g:828:5: ( (lv_infix_7_0= ruleinfixOperator ) )
                    	    // InternalTeSSLa.g:829:6: (lv_infix_7_0= ruleinfixOperator )
                    	    {
                    	    // InternalTeSSLa.g:829:6: (lv_infix_7_0= ruleinfixOperator )
                    	    // InternalTeSSLa.g:830:7: lv_infix_7_0= ruleinfixOperator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExpressionAccess().getInfixInfixOperatorParserRuleCall_1_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_infix_7_0=ruleinfixOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"infix",
                    	      								lv_infix_7_0,
                    	      								"de.uniluebeck.isp.tessla.TeSSLa.infixOperator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalTeSSLa.g:847:5: ( (lv_val_8_0= rulevalue ) )
                    	    // InternalTeSSLa.g:848:6: (lv_val_8_0= rulevalue )
                    	    {
                    	    // InternalTeSSLa.g:848:6: (lv_val_8_0= rulevalue )
                    	    // InternalTeSSLa.g:849:7: lv_val_8_0= rulevalue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExpressionAccess().getValValueParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_val_8_0=rulevalue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"val",
                    	      								lv_val_8_0,
                    	      								"de.uniluebeck.isp.tessla.TeSSLa.value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulevalue"
    // InternalTeSSLa.g:872:1: entryRulevalue returns [EObject current=null] : iv_rulevalue= rulevalue EOF ;
    public final EObject entryRulevalue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue = null;


        try {
            // InternalTeSSLa.g:872:46: (iv_rulevalue= rulevalue EOF )
            // InternalTeSSLa.g:873:2: iv_rulevalue= rulevalue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevalue=rulevalue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevalue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue"


    // $ANTLR start "rulevalue"
    // InternalTeSSLa.g:879:1: rulevalue returns [EObject current=null] : ( () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | ( (lv_name_17_0= RULE_STRING ) ) | ( (lv_val_18_0= RULE_INT ) ) | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' ) ) ;
    public final EObject rulevalue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_name_16_0=null;
        Token lv_name_17_0=null;
        Token lv_val_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_exp_2_0 = null;

        EObject lv_exp_4_0 = null;

        EObject lv_statements_7_0 = null;

        EObject lv_exp_8_0 = null;

        EObject lv_args_12_0 = null;

        EObject lv_args_14_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:885:2: ( ( () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | ( (lv_name_17_0= RULE_STRING ) ) | ( (lv_val_18_0= RULE_INT ) ) | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' ) ) )
            // InternalTeSSLa.g:886:2: ( () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | ( (lv_name_17_0= RULE_STRING ) ) | ( (lv_val_18_0= RULE_INT ) ) | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' ) )
            {
            // InternalTeSSLa.g:886:2: ( () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | ( (lv_name_17_0= RULE_STRING ) ) | ( (lv_val_18_0= RULE_INT ) ) | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' ) )
            // InternalTeSSLa.g:887:3: () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | ( (lv_name_17_0= RULE_STRING ) ) | ( (lv_val_18_0= RULE_INT ) ) | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' )
            {
            // InternalTeSSLa.g:887:3: ()
            // InternalTeSSLa.g:888:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getValueAccess().getValueAction_0(),
              					current);
              			
            }

            }

            // InternalTeSSLa.g:897:3: ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | ( (lv_name_17_0= RULE_STRING ) ) | ( (lv_val_18_0= RULE_INT ) ) | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' )
            int alt20=10;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalTeSSLa.g:898:4: ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) )
                    {
                    // InternalTeSSLa.g:898:4: ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) )
                    // InternalTeSSLa.g:899:5: ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) )
                    {
                    // InternalTeSSLa.g:899:5: ( (lv_op_1_0= ruleunaryOperator ) )
                    // InternalTeSSLa.g:900:6: (lv_op_1_0= ruleunaryOperator )
                    {
                    // InternalTeSSLa.g:900:6: (lv_op_1_0= ruleunaryOperator )
                    // InternalTeSSLa.g:901:7: lv_op_1_0= ruleunaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getValueAccess().getOpUnaryOperatorParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_8);
                    lv_op_1_0=ruleunaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getValueRule());
                      							}
                      							set(
                      								current,
                      								"op",
                      								lv_op_1_0,
                      								"de.uniluebeck.isp.tessla.TeSSLa.unaryOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTeSSLa.g:918:5: ( (lv_exp_2_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:919:6: (lv_exp_2_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:919:6: (lv_exp_2_0= ruletypedExpression )
                    // InternalTeSSLa.g:920:7: lv_exp_2_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getValueAccess().getExpTypedExpressionParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_2_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getValueRule());
                      							}
                      							set(
                      								current,
                      								"exp",
                      								lv_exp_2_0,
                      								"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:939:4: (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' )
                    {
                    // InternalTeSSLa.g:939:4: (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' )
                    // InternalTeSSLa.g:940:5: otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getValueAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalTeSSLa.g:944:5: ( (lv_exp_4_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:945:6: (lv_exp_4_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:945:6: (lv_exp_4_0= ruletypedExpression )
                    // InternalTeSSLa.g:946:7: lv_exp_4_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getValueAccess().getExpTypedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_13);
                    lv_exp_4_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getValueRule());
                      							}
                      							set(
                      								current,
                      								"exp",
                      								lv_exp_4_0,
                      								"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getValueAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:969:4: (otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' )
                    {
                    // InternalTeSSLa.g:969:4: (otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' )
                    // InternalTeSSLa.g:970:5: otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_1_2_0());
                      				
                    }
                    // InternalTeSSLa.g:974:5: ( (lv_statements_7_0= rulestatement ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_SL_COMMENT||(LA17_0>=11 && LA17_0<=12)||LA17_0==20||LA17_0==22) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalTeSSLa.g:975:6: (lv_statements_7_0= rulestatement )
                    	    {
                    	    // InternalTeSSLa.g:975:6: (lv_statements_7_0= rulestatement )
                    	    // InternalTeSSLa.g:976:7: lv_statements_7_0= rulestatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getValueAccess().getStatementsStatementParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_statements_7_0=rulestatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"statements",
                    	      								lv_statements_7_0,
                    	      								"de.uniluebeck.isp.tessla.TeSSLa.statement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // InternalTeSSLa.g:993:5: ( (lv_exp_8_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:994:6: (lv_exp_8_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:994:6: (lv_exp_8_0= ruletypedExpression )
                    // InternalTeSSLa.g:995:7: lv_exp_8_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getValueAccess().getExpTypedExpressionParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_10);
                    lv_exp_8_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getValueRule());
                      							}
                      							set(
                      								current,
                      								"exp",
                      								lv_exp_8_0,
                      								"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_1_2_3());
                      				
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTeSSLa.g:1018:4: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' )
                    {
                    // InternalTeSSLa.g:1018:4: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' )
                    // InternalTeSSLa.g:1019:5: ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')'
                    {
                    // InternalTeSSLa.g:1019:5: ( (lv_name_10_0= RULE_ID ) )
                    // InternalTeSSLa.g:1020:6: (lv_name_10_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:1020:6: (lv_name_10_0= RULE_ID )
                    // InternalTeSSLa.g:1021:7: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_10_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_3_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getValueRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_10_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getValueAccess().getLeftParenthesisKeyword_1_3_1());
                      				
                    }
                    // InternalTeSSLa.g:1041:5: ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==15||LA19_0==17||LA19_0==23||(LA19_0>=26 && LA19_0<=28)||LA19_0==43||(LA19_0>=48 && LA19_0<=49)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalTeSSLa.g:1042:6: ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )*
                            {
                            // InternalTeSSLa.g:1042:6: ( (lv_args_12_0= rulearg ) )
                            // InternalTeSSLa.g:1043:7: (lv_args_12_0= rulearg )
                            {
                            // InternalTeSSLa.g:1043:7: (lv_args_12_0= rulearg )
                            // InternalTeSSLa.g:1044:8: lv_args_12_0= rulearg
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_12);
                            lv_args_12_0=rulearg();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getValueRule());
                              								}
                              								add(
                              									current,
                              									"args",
                              									lv_args_12_0,
                              									"de.uniluebeck.isp.tessla.TeSSLa.arg");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalTeSSLa.g:1061:6: (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==18) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalTeSSLa.g:1062:7: otherlv_13= ',' ( (lv_args_14_0= rulearg ) )
                            	    {
                            	    otherlv_13=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_13, grammarAccess.getValueAccess().getCommaKeyword_1_3_2_1_0());
                            	      						
                            	    }
                            	    // InternalTeSSLa.g:1066:7: ( (lv_args_14_0= rulearg ) )
                            	    // InternalTeSSLa.g:1067:8: (lv_args_14_0= rulearg )
                            	    {
                            	    // InternalTeSSLa.g:1067:8: (lv_args_14_0= rulearg )
                            	    // InternalTeSSLa.g:1068:9: lv_args_14_0= rulearg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_12);
                            	    lv_args_14_0=rulearg();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getValueRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"args",
                            	      										lv_args_14_0,
                            	      										"de.uniluebeck.isp.tessla.TeSSLa.arg");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getValueAccess().getRightParenthesisKeyword_1_3_3());
                      				
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTeSSLa.g:1093:4: ( (lv_name_16_0= RULE_ID ) )
                    {
                    // InternalTeSSLa.g:1093:4: ( (lv_name_16_0= RULE_ID ) )
                    // InternalTeSSLa.g:1094:5: (lv_name_16_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:1094:5: (lv_name_16_0= RULE_ID )
                    // InternalTeSSLa.g:1095:6: lv_name_16_0= RULE_ID
                    {
                    lv_name_16_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_16_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getValueRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_16_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalTeSSLa.g:1112:4: ( (lv_name_17_0= RULE_STRING ) )
                    {
                    // InternalTeSSLa.g:1112:4: ( (lv_name_17_0= RULE_STRING ) )
                    // InternalTeSSLa.g:1113:5: (lv_name_17_0= RULE_STRING )
                    {
                    // InternalTeSSLa.g:1113:5: (lv_name_17_0= RULE_STRING )
                    // InternalTeSSLa.g:1114:6: lv_name_17_0= RULE_STRING
                    {
                    lv_name_17_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_17_0, grammarAccess.getValueAccess().getNameSTRINGTerminalRuleCall_1_5_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getValueRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_17_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalTeSSLa.g:1131:4: ( (lv_val_18_0= RULE_INT ) )
                    {
                    // InternalTeSSLa.g:1131:4: ( (lv_val_18_0= RULE_INT ) )
                    // InternalTeSSLa.g:1132:5: (lv_val_18_0= RULE_INT )
                    {
                    // InternalTeSSLa.g:1132:5: (lv_val_18_0= RULE_INT )
                    // InternalTeSSLa.g:1133:6: lv_val_18_0= RULE_INT
                    {
                    lv_val_18_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_val_18_0, grammarAccess.getValueAccess().getValINTTerminalRuleCall_1_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getValueRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"val",
                      							lv_val_18_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalTeSSLa.g:1150:4: otherlv_19= '()'
                    {
                    otherlv_19=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getValueAccess().getLeftParenthesisRightParenthesisKeyword_1_7());
                      			
                    }

                    }
                    break;
                case 9 :
                    // InternalTeSSLa.g:1155:4: otherlv_20= 'true'
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getValueAccess().getTrueKeyword_1_8());
                      			
                    }

                    }
                    break;
                case 10 :
                    // InternalTeSSLa.g:1160:4: otherlv_21= 'false'
                    {
                    otherlv_21=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getValueAccess().getFalseKeyword_1_9());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue"


    // $ANTLR start "entryRulearg"
    // InternalTeSSLa.g:1169:1: entryRulearg returns [EObject current=null] : iv_rulearg= rulearg EOF ;
    public final EObject entryRulearg() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearg = null;


        try {
            // InternalTeSSLa.g:1169:44: (iv_rulearg= rulearg EOF )
            // InternalTeSSLa.g:1170:2: iv_rulearg= rulearg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulearg=rulearg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearg; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearg"


    // $ANTLR start "rulearg"
    // InternalTeSSLa.g:1176:1: rulearg returns [EObject current=null] : ( ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) ) | ( (lv_exp_3_0= ruletypedExpression ) ) ) ;
    public final EObject rulearg() throws RecognitionException {
        EObject current = null;

        Token lv_arg_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:1182:2: ( ( ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) ) | ( (lv_exp_3_0= ruletypedExpression ) ) ) )
            // InternalTeSSLa.g:1183:2: ( ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) ) | ( (lv_exp_3_0= ruletypedExpression ) ) )
            {
            // InternalTeSSLa.g:1183:2: ( ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) ) | ( (lv_exp_3_0= ruletypedExpression ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EOF||LA21_1==13||(LA21_1>=17 && LA21_1<=19)||(LA21_1>=30 && LA21_1<=47)) ) {
                    alt21=2;
                }
                else if ( (LA21_1==29) ) {
                    alt21=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||LA21_0==15||LA21_0==17||LA21_0==23||(LA21_0>=26 && LA21_0<=28)||LA21_0==43||(LA21_0>=48 && LA21_0<=49)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTeSSLa.g:1184:3: ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) )
                    {
                    // InternalTeSSLa.g:1184:3: ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) )
                    // InternalTeSSLa.g:1185:4: ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) )
                    {
                    // InternalTeSSLa.g:1185:4: ( (lv_arg_0_0= RULE_ID ) )
                    // InternalTeSSLa.g:1186:5: (lv_arg_0_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:1186:5: (lv_arg_0_0= RULE_ID )
                    // InternalTeSSLa.g:1187:6: lv_arg_0_0= RULE_ID
                    {
                    lv_arg_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_arg_0_0, grammarAccess.getArgAccess().getArgIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArgRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"arg",
                      							lv_arg_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArgAccess().getEqualsSignKeyword_0_1());
                      			
                    }
                    // InternalTeSSLa.g:1207:4: ( (lv_exp_2_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:1208:5: (lv_exp_2_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:1208:5: (lv_exp_2_0= ruletypedExpression )
                    // InternalTeSSLa.g:1209:6: lv_exp_2_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArgAccess().getExpTypedExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_2_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArgRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_2_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:1228:3: ( (lv_exp_3_0= ruletypedExpression ) )
                    {
                    // InternalTeSSLa.g:1228:3: ( (lv_exp_3_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:1229:4: (lv_exp_3_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:1229:4: (lv_exp_3_0= ruletypedExpression )
                    // InternalTeSSLa.g:1230:5: lv_exp_3_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArgAccess().getExpTypedExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_3_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getArgRule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_3_0,
                      						"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearg"


    // $ANTLR start "entryRuletype"
    // InternalTeSSLa.g:1251:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // InternalTeSSLa.g:1251:44: (iv_ruletype= ruletype EOF )
            // InternalTeSSLa.g:1252:2: iv_ruletype= ruletype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalTeSSLa.g:1258:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_6=null;
        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_type_4 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:1264:2: ( ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID ) )
            // InternalTeSSLa.g:1265:2: ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID )
            {
            // InternalTeSSLa.g:1265:2: ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred33_InternalTeSSLa()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTeSSLa.g:1266:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
                    {
                    // InternalTeSSLa.g:1266:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
                    // InternalTeSSLa.g:1267:4: this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_0, grammarAccess.getTypeAccess().getIDTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getLessThanSignKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_24);
                    this_type_2=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTeSSLa.g:1289:4: (kw= ',' this_type_4= ruletype )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==18) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalTeSSLa.g:1290:5: kw= ',' this_type_4= ruletype
                    	    {
                    	    kw=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getTypeAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_0_3_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    this_type_4=ruletype();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_type_4);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getGreaterThanSignKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:1313:3: this_ID_6= RULE_ID
                    {
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_6, grammarAccess.getTypeAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRuleinfixOperator"
    // InternalTeSSLa.g:1324:1: entryRuleinfixOperator returns [String current=null] : iv_ruleinfixOperator= ruleinfixOperator EOF ;
    public final String entryRuleinfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinfixOperator = null;


        try {
            // InternalTeSSLa.g:1324:53: (iv_ruleinfixOperator= ruleinfixOperator EOF )
            // InternalTeSSLa.g:1325:2: iv_ruleinfixOperator= ruleinfixOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleinfixOperator=ruleinfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinfixOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinfixOperator"


    // $ANTLR start "ruleinfixOperator"
    // InternalTeSSLa.g:1331:1: ruleinfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '&&' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleinfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTeSSLa.g:1337:2: ( (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '&&' | kw= '||' ) )
            // InternalTeSSLa.g:1338:2: (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '&&' | kw= '||' )
            {
            // InternalTeSSLa.g:1338:2: (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '&&' | kw= '||' )
            int alt24=18;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt24=1;
                }
                break;
            case 33:
                {
                alt24=2;
                }
                break;
            case 34:
                {
                alt24=3;
                }
                break;
            case 35:
                {
                alt24=4;
                }
                break;
            case 36:
                {
                alt24=5;
                }
                break;
            case 30:
                {
                alt24=6;
                }
                break;
            case 31:
                {
                alt24=7;
                }
                break;
            case 37:
                {
                alt24=8;
                }
                break;
            case 38:
                {
                alt24=9;
                }
                break;
            case 39:
                {
                alt24=10;
                }
                break;
            case 40:
                {
                alt24=11;
                }
                break;
            case 41:
                {
                alt24=12;
                }
                break;
            case 42:
                {
                alt24=13;
                }
                break;
            case 43:
                {
                alt24=14;
                }
                break;
            case 44:
                {
                alt24=15;
                }
                break;
            case 45:
                {
                alt24=16;
                }
                break;
            case 46:
                {
                alt24=17;
                }
                break;
            case 47:
                {
                alt24=18;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalTeSSLa.g:1339:3: kw= '%'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getPercentSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:1345:3: kw= '<<'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignLessThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:1351:3: kw= '>>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTeSSLa.g:1357:3: kw= '>='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTeSSLa.g:1363:3: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTeSSLa.g:1369:3: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalTeSSLa.g:1375:3: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalTeSSLa.g:1381:3: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getExclamationMarkEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalTeSSLa.g:1387:3: kw= '=='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getEqualsSignEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalTeSSLa.g:1393:3: kw= '&'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAmpersandKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalTeSSLa.g:1399:3: kw= '|'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getVerticalLineKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalTeSSLa.g:1405:3: kw= '^'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getCircumflexAccentKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalTeSSLa.g:1411:3: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getPlusSignKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalTeSSLa.g:1417:3: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getHyphenMinusKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalTeSSLa.g:1423:3: kw= '*'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAsteriskKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalTeSSLa.g:1429:3: kw= '/'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getSolidusKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalTeSSLa.g:1435:3: kw= '&&'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAmpersandAmpersandKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalTeSSLa.g:1441:3: kw= '||'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getVerticalLineVerticalLineKeyword_17());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinfixOperator"


    // $ANTLR start "entryRuleunaryOperator"
    // InternalTeSSLa.g:1450:1: entryRuleunaryOperator returns [String current=null] : iv_ruleunaryOperator= ruleunaryOperator EOF ;
    public final String entryRuleunaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunaryOperator = null;


        try {
            // InternalTeSSLa.g:1450:53: (iv_ruleunaryOperator= ruleunaryOperator EOF )
            // InternalTeSSLa.g:1451:2: iv_ruleunaryOperator= ruleunaryOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleunaryOperator=ruleunaryOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunaryOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunaryOperator"


    // $ANTLR start "ruleunaryOperator"
    // InternalTeSSLa.g:1457:1: ruleunaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '~' | kw= '-' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleunaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTeSSLa.g:1463:2: ( (kw= '~' | kw= '-' | kw= '!' ) )
            // InternalTeSSLa.g:1464:2: (kw= '~' | kw= '-' | kw= '!' )
            {
            // InternalTeSSLa.g:1464:2: (kw= '~' | kw= '-' | kw= '!' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt25=1;
                }
                break;
            case 43:
                {
                alt25=2;
                }
                break;
            case 49:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalTeSSLa.g:1465:3: kw= '~'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:1471:3: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:1477:3: kw= '!'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunaryOperator"

    // $ANTLR start synpred8_InternalTeSSLa
    public final void synpred8_InternalTeSSLa_fragment() throws RecognitionException {   
        EObject lv_expression_7_0 = null;


        // InternalTeSSLa.g:308:4: ( ( (lv_expression_7_0= ruletypedExpression ) ) )
        // InternalTeSSLa.g:308:4: ( (lv_expression_7_0= ruletypedExpression ) )
        {
        // InternalTeSSLa.g:308:4: ( (lv_expression_7_0= ruletypedExpression ) )
        // InternalTeSSLa.g:309:5: (lv_expression_7_0= ruletypedExpression )
        {
        // InternalTeSSLa.g:309:5: (lv_expression_7_0= ruletypedExpression )
        // InternalTeSSLa.g:310:6: lv_expression_7_0= ruletypedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionTypedExpressionParserRuleCall_5_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_expression_7_0=ruletypedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalTeSSLa

    // $ANTLR start synpred15_InternalTeSSLa
    public final void synpred15_InternalTeSSLa_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


        // InternalTeSSLa.g:690:4: (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
        // InternalTeSSLa.g:690:4: otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
        {
        otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return ;
        // InternalTeSSLa.g:694:4: ( (lv_type_2_0= ruletype ) )
        // InternalTeSSLa.g:695:5: (lv_type_2_0= ruletype )
        {
        // InternalTeSSLa.g:695:5: (lv_type_2_0= ruletype )
        // InternalTeSSLa.g:696:6: lv_type_2_0= ruletype
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTypedExpressionAccess().getTypeTypeParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_type_2_0=ruletype();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalTeSSLa

    // $ANTLR start synpred16_InternalTeSSLa
    public final void synpred16_InternalTeSSLa_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_else_5_0 = null;


        // InternalTeSSLa.g:781:5: (otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) ) )
        // InternalTeSSLa.g:781:5: otherlv_4= 'else' ( (lv_else_5_0= ruletypedExpression ) )
        {
        otherlv_4=(Token)match(input,25,FOLLOW_8); if (state.failed) return ;
        // InternalTeSSLa.g:785:5: ( (lv_else_5_0= ruletypedExpression ) )
        // InternalTeSSLa.g:786:6: (lv_else_5_0= ruletypedExpression )
        {
        // InternalTeSSLa.g:786:6: (lv_else_5_0= ruletypedExpression )
        // InternalTeSSLa.g:787:7: lv_else_5_0= ruletypedExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getElseTypedExpressionParserRuleCall_0_4_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_else_5_0=ruletypedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalTeSSLa

    // $ANTLR start synpred18_InternalTeSSLa
    public final void synpred18_InternalTeSSLa_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_infix_7_0 = null;

        EObject lv_val_8_0 = null;


        // InternalTeSSLa.g:828:5: ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )
        // InternalTeSSLa.g:828:5: ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) )
        {
        // InternalTeSSLa.g:828:5: ( (lv_infix_7_0= ruleinfixOperator ) )
        // InternalTeSSLa.g:829:6: (lv_infix_7_0= ruleinfixOperator )
        {
        // InternalTeSSLa.g:829:6: (lv_infix_7_0= ruleinfixOperator )
        // InternalTeSSLa.g:830:7: lv_infix_7_0= ruleinfixOperator
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getInfixInfixOperatorParserRuleCall_1_1_0_0());
          						
        }
        pushFollow(FOLLOW_8);
        lv_infix_7_0=ruleinfixOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalTeSSLa.g:847:5: ( (lv_val_8_0= rulevalue ) )
        // InternalTeSSLa.g:848:6: (lv_val_8_0= rulevalue )
        {
        // InternalTeSSLa.g:848:6: (lv_val_8_0= rulevalue )
        // InternalTeSSLa.g:849:7: lv_val_8_0= rulevalue
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getValValueParserRuleCall_1_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_val_8_0=rulevalue();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalTeSSLa

    // $ANTLR start synpred25_InternalTeSSLa
    public final void synpred25_InternalTeSSLa_fragment() throws RecognitionException {   
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_args_12_0 = null;

        EObject lv_args_14_0 = null;


        // InternalTeSSLa.g:1018:4: ( ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) )
        // InternalTeSSLa.g:1018:4: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' )
        {
        // InternalTeSSLa.g:1018:4: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' )
        // InternalTeSSLa.g:1019:5: ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')'
        {
        // InternalTeSSLa.g:1019:5: ( (lv_name_10_0= RULE_ID ) )
        // InternalTeSSLa.g:1020:6: (lv_name_10_0= RULE_ID )
        {
        // InternalTeSSLa.g:1020:6: (lv_name_10_0= RULE_ID )
        // InternalTeSSLa.g:1021:7: lv_name_10_0= RULE_ID
        {
        lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,17,FOLLOW_21); if (state.failed) return ;
        // InternalTeSSLa.g:1041:5: ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )?
        int alt34=2;
        int LA34_0 = input.LA(1);

        if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INT)||LA34_0==15||LA34_0==17||LA34_0==23||(LA34_0>=26 && LA34_0<=28)||LA34_0==43||(LA34_0>=48 && LA34_0<=49)) ) {
            alt34=1;
        }
        switch (alt34) {
            case 1 :
                // InternalTeSSLa.g:1042:6: ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )*
                {
                // InternalTeSSLa.g:1042:6: ( (lv_args_12_0= rulearg ) )
                // InternalTeSSLa.g:1043:7: (lv_args_12_0= rulearg )
                {
                // InternalTeSSLa.g:1043:7: (lv_args_12_0= rulearg )
                // InternalTeSSLa.g:1044:8: lv_args_12_0= rulearg
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_0_0());
                  							
                }
                pushFollow(FOLLOW_12);
                lv_args_12_0=rulearg();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalTeSSLa.g:1061:6: (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )*
                loop33:
                do {
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==18) ) {
                        alt33=1;
                    }


                    switch (alt33) {
                	case 1 :
                	    // InternalTeSSLa.g:1062:7: otherlv_13= ',' ( (lv_args_14_0= rulearg ) )
                	    {
                	    otherlv_13=(Token)match(input,18,FOLLOW_8); if (state.failed) return ;
                	    // InternalTeSSLa.g:1066:7: ( (lv_args_14_0= rulearg ) )
                	    // InternalTeSSLa.g:1067:8: (lv_args_14_0= rulearg )
                	    {
                	    // InternalTeSSLa.g:1067:8: (lv_args_14_0= rulearg )
                	    // InternalTeSSLa.g:1068:9: lv_args_14_0= rulearg
                	    {
                	    if ( state.backtracking==0 ) {

                	      									newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_1_1_0());
                	      								
                	    }
                	    pushFollow(FOLLOW_12);
                	    lv_args_14_0=rulearg();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop33;
                    }
                } while (true);


                }
                break;

        }

        otherlv_15=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalTeSSLa

    // $ANTLR start synpred26_InternalTeSSLa
    public final void synpred26_InternalTeSSLa_fragment() throws RecognitionException {   
        Token lv_name_16_0=null;

        // InternalTeSSLa.g:1093:4: ( ( (lv_name_16_0= RULE_ID ) ) )
        // InternalTeSSLa.g:1093:4: ( (lv_name_16_0= RULE_ID ) )
        {
        // InternalTeSSLa.g:1093:4: ( (lv_name_16_0= RULE_ID ) )
        // InternalTeSSLa.g:1094:5: (lv_name_16_0= RULE_ID )
        {
        // InternalTeSSLa.g:1094:5: (lv_name_16_0= RULE_ID )
        // InternalTeSSLa.g:1095:6: lv_name_16_0= RULE_ID
        {
        lv_name_16_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalTeSSLa

    // $ANTLR start synpred33_InternalTeSSLa
    public final void synpred33_InternalTeSSLa_fragment() throws RecognitionException {   
        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_type_4 = null;


        // InternalTeSSLa.g:1266:3: ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) )
        // InternalTeSSLa.g:1266:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
        {
        // InternalTeSSLa.g:1266:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
        // InternalTeSSLa.g:1267:4: this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>'
        {
        this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return ;
        kw=(Token)match(input,30,FOLLOW_4); if (state.failed) return ;
        pushFollow(FOLLOW_24);
        this_type_2=ruletype();

        state._fsp--;
        if (state.failed) return ;
        // InternalTeSSLa.g:1289:4: (kw= ',' this_type_4= ruletype )*
        loop35:
        do {
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }


            switch (alt35) {
        	case 1 :
        	    // InternalTeSSLa.g:1290:5: kw= ',' this_type_4= ruletype
        	    {
        	    kw=(Token)match(input,18,FOLLOW_4); if (state.failed) return ;
        	    pushFollow(FOLLOW_24);
        	    this_type_4=ruletype();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop35;
            }
        } while (true);

        kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalTeSSLa

    // Delegated rules

    public final boolean synpred8_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\5\5\uffff\1\0\7\uffff";
    static final String dfa_3s = "\1\61\5\uffff\1\0\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\13\uffff\1\2";
    static final String dfa_5s = "\6\uffff\1\0\7\uffff}>";
    static final String[] dfa_6s = {
            "\3\1\7\uffff\1\6\1\uffff\1\1\5\uffff\1\1\2\uffff\3\1\16\uffff\1\1\4\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "307:3: ( ( (lv_expression_7_0= ruletypedExpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalTeSSLa()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\25\uffff";
    static final String dfa_8s = "\1\1\24\uffff";
    static final String dfa_9s = "\1\4\1\uffff\22\0\1\uffff";
    static final String dfa_10s = "\1\61\1\uffff\22\0\1\uffff";
    static final String dfa_11s = "\1\uffff\1\2\22\uffff\1\1";
    static final String dfa_12s = "\2\uffff\1\15\1\10\1\5\1\0\1\16\1\11\1\6\1\1\1\17\1\12\1\7\1\2\1\20\1\13\1\3\1\21\1\14\1\4\1\uffff}>";
    static final String[] dfa_13s = {
            "\4\1\3\uffff\3\1\1\uffff\16\1\1\uffff\1\10\1\11\1\3\1\4\1\5\1\6\1\7\1\12\1\13\1\14\1\15\1\16\1\17\1\2\1\20\1\21\1\22\1\23\2\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 827:4: ( ( (lv_infix_7_0= ruleinfixOperator ) ) ( (lv_val_8_0= rulevalue ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_16 = input.LA(1);

                         
                        int index15_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_19 = input.LA(1);

                         
                        int index15_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_19);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_15 = input.LA(1);

                         
                        int index15_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_18 = input.LA(1);

                         
                        int index15_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_18);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA15_14 = input.LA(1);

                         
                        int index15_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_14);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA15_17 = input.LA(1);

                         
                        int index15_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\4\1\5";
    static final String[] dfa_15s = {
            "\1\6\1\7\1\10\7\uffff\1\5\1\uffff\1\4\10\uffff\1\11\1\12\1\13\16\uffff\1\1\4\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_14;
            this.special = dfa_5;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "897:3: ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= rulestatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | ( (lv_name_17_0= RULE_STRING ) ) | ( (lv_val_18_0= RULE_INT ) ) | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalTeSSLa()) ) {s = 12;}

                        else if ( (synpred26_InternalTeSSLa()) ) {s = 13;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000501812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000308001C8280E0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000308001CD298F0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000FFFFC0000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000308001C8A80E0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080040000L});

}
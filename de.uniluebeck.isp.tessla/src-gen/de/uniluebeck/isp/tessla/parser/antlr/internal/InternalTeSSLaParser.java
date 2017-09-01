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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'define'", "':'", "':='", "'('", "','", "')'", "'out'", "'as'", "'in'", "'if'", "'then'", "'else'", "'{'", "'}'", "'()'", "'true'", "'false'", "'='", "'<'", "'>'", "'%'", "'<<'", "'>>'", "'>='", "'<='", "'!='", "'=='", "'&'", "'|'", "'^'", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'~'", "'!'"
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
    // InternalTeSSLa.g:77:1: ruleModel returns [EObject current=null] : ( (lv_spec_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_spec_0_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:83:2: ( ( (lv_spec_0_0= ruleStatement ) )* )
            // InternalTeSSLa.g:84:2: ( (lv_spec_0_0= ruleStatement ) )*
            {
            // InternalTeSSLa.g:84:2: ( (lv_spec_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SL_COMMENT||(LA1_0>=11 && LA1_0<=12)||LA1_0==18||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTeSSLa.g:85:3: (lv_spec_0_0= ruleStatement )
            	    {
            	    // InternalTeSSLa.g:85:3: (lv_spec_0_0= ruleStatement )
            	    // InternalTeSSLa.g:86:4: lv_spec_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getSpecStatementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_spec_0_0=ruleStatement();

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
            	      					"de.uniluebeck.isp.tessla.TeSSLa.Statement");
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


    // $ANTLR start "entryRuleStatement"
    // InternalTeSSLa.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTeSSLa.g:106:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTeSSLa.g:107:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTeSSLa.g:113:1: ruleStatement returns [EObject current=null] : ( () ( ( (lv_def_1_0= ruledefinition ) ) | ( (lv_out_2_0= ruleout ) ) | ( (lv_in_3_0= rulein ) ) | ( (lv_comment_4_0= RULE_SL_COMMENT ) ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
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
            case 18:
                {
                alt2=2;
                }
                break;
            case 20:
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
    // $ANTLR end "ruleStatement"


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
    // InternalTeSSLa.g:222:1: ruledefinition returns [EObject current=null] : ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( (lv_expression_7_0= ruletypedExpression ) ) ) ;
    public final EObject ruledefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_paramList_3_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_expression_7_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:228:2: ( ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( (lv_expression_7_0= ruletypedExpression ) ) ) )
            // InternalTeSSLa.g:229:2: ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( (lv_expression_7_0= ruletypedExpression ) ) )
            {
            // InternalTeSSLa.g:229:2: ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( (lv_expression_7_0= ruletypedExpression ) ) )
            // InternalTeSSLa.g:230:3: (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( (lv_expression_7_0= ruletypedExpression ) )
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

            // InternalTeSSLa.g:241:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTeSSLa.g:242:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTeSSLa.g:242:4: (lv_name_2_0= RULE_ID )
            // InternalTeSSLa.g:243:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalTeSSLa.g:259:3: ( (lv_paramList_3_0= ruleparamList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
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
            // InternalTeSSLa.g:307:3: ( (lv_expression_7_0= ruletypedExpression ) )
            // InternalTeSSLa.g:308:4: (lv_expression_7_0= ruletypedExpression )
            {
            // InternalTeSSLa.g:308:4: (lv_expression_7_0= ruletypedExpression )
            // InternalTeSSLa.g:309:5: lv_expression_7_0= ruletypedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionTypedExpressionParserRuleCall_5_0());
              				
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
    // InternalTeSSLa.g:330:1: entryRuleparamList returns [EObject current=null] : iv_ruleparamList= ruleparamList EOF ;
    public final EObject entryRuleparamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparamList = null;


        try {
            // InternalTeSSLa.g:330:50: (iv_ruleparamList= ruleparamList EOF )
            // InternalTeSSLa.g:331:2: iv_ruleparamList= ruleparamList EOF
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
    // InternalTeSSLa.g:337:1: ruleparamList returns [EObject current=null] : ( () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) ) ) ;
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
            // InternalTeSSLa.g:343:2: ( ( () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) ) ) )
            // InternalTeSSLa.g:344:2: ( () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) ) )
            {
            // InternalTeSSLa.g:344:2: ( () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) ) )
            // InternalTeSSLa.g:345:3: () ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) )
            {
            // InternalTeSSLa.g:345:3: ()
            // InternalTeSSLa.g:346:4: 
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

            // InternalTeSSLa.g:355:3: ( (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==17) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_ID) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTeSSLa.g:356:4: (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' )
                    {
                    // InternalTeSSLa.g:356:4: (otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' )
                    // InternalTeSSLa.g:357:5: otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getParamListAccess().getLeftParenthesisKeyword_1_0_0());
                      				
                    }
                    // InternalTeSSLa.g:361:5: ( (lv_params_2_0= RULE_ID ) )
                    // InternalTeSSLa.g:362:6: (lv_params_2_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:362:6: (lv_params_2_0= RULE_ID )
                    // InternalTeSSLa.g:363:7: lv_params_2_0= RULE_ID
                    {
                    lv_params_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

                    // InternalTeSSLa.g:379:5: (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==13) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalTeSSLa.g:380:6: otherlv_3= ':' ( (lv_types_4_0= ruletype ) )
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getParamListAccess().getColonKeyword_1_0_2_0());
                              					
                            }
                            // InternalTeSSLa.g:384:6: ( (lv_types_4_0= ruletype ) )
                            // InternalTeSSLa.g:385:7: (lv_types_4_0= ruletype )
                            {
                            // InternalTeSSLa.g:385:7: (lv_types_4_0= ruletype )
                            // InternalTeSSLa.g:386:8: lv_types_4_0= ruletype
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParamListAccess().getTypesTypeParserRuleCall_1_0_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_10);
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

                    // InternalTeSSLa.g:404:5: (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalTeSSLa.g:405:6: otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )?
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getParamListAccess().getCommaKeyword_1_0_3_0());
                    	      					
                    	    }
                    	    // InternalTeSSLa.g:409:6: ( (lv_params_6_0= RULE_ID ) )
                    	    // InternalTeSSLa.g:410:7: (lv_params_6_0= RULE_ID )
                    	    {
                    	    // InternalTeSSLa.g:410:7: (lv_params_6_0= RULE_ID )
                    	    // InternalTeSSLa.g:411:8: lv_params_6_0= RULE_ID
                    	    {
                    	    lv_params_6_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

                    	    // InternalTeSSLa.g:427:6: (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==13) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // InternalTeSSLa.g:428:7: otherlv_7= ':' ( (lv_types_8_0= ruletype ) )
                    	            {
                    	            otherlv_7=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_7, grammarAccess.getParamListAccess().getColonKeyword_1_0_3_2_0());
                    	              						
                    	            }
                    	            // InternalTeSSLa.g:432:7: ( (lv_types_8_0= ruletype ) )
                    	            // InternalTeSSLa.g:433:8: (lv_types_8_0= ruletype )
                    	            {
                    	            // InternalTeSSLa.g:433:8: (lv_types_8_0= ruletype )
                    	            // InternalTeSSLa.g:434:9: lv_types_8_0= ruletype
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              									newCompositeNode(grammarAccess.getParamListAccess().getTypesTypeParserRuleCall_1_0_3_2_1_0());
                    	              								
                    	            }
                    	            pushFollow(FOLLOW_10);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getParamListAccess().getRightParenthesisKeyword_1_0_4());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:459:4: (otherlv_10= '(' otherlv_11= ')' )
                    {
                    // InternalTeSSLa.g:459:4: (otherlv_10= '(' otherlv_11= ')' )
                    // InternalTeSSLa.g:460:5: otherlv_10= '(' otherlv_11= ')'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getParamListAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    otherlv_11=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalTeSSLa.g:474:1: entryRuleout returns [EObject current=null] : iv_ruleout= ruleout EOF ;
    public final EObject entryRuleout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleout = null;


        try {
            // InternalTeSSLa.g:474:44: (iv_ruleout= ruleout EOF )
            // InternalTeSSLa.g:475:2: iv_ruleout= ruleout EOF
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
    // InternalTeSSLa.g:481:1: ruleout returns [EObject current=null] : (otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:487:2: ( (otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // InternalTeSSLa.g:488:2: (otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // InternalTeSSLa.g:488:2: (otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // InternalTeSSLa.g:489:3: otherlv_0= 'out' ( (lv_exp_1_0= ruletypedExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOutAccess().getOutKeyword_0());
              		
            }
            // InternalTeSSLa.g:493:3: ( (lv_exp_1_0= ruletypedExpression ) )
            // InternalTeSSLa.g:494:4: (lv_exp_1_0= ruletypedExpression )
            {
            // InternalTeSSLa.g:494:4: (lv_exp_1_0= ruletypedExpression )
            // InternalTeSSLa.g:495:5: lv_exp_1_0= ruletypedExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOutAccess().getExpTypedExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            // InternalTeSSLa.g:512:3: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTeSSLa.g:513:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOutAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalTeSSLa.g:517:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalTeSSLa.g:518:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:518:5: (lv_name_3_0= RULE_ID )
                    // InternalTeSSLa.g:519:6: lv_name_3_0= RULE_ID
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
    // InternalTeSSLa.g:540:1: entryRulein returns [EObject current=null] : iv_rulein= rulein EOF ;
    public final EObject entryRulein() throws RecognitionException {
        EObject current = null;

        EObject iv_rulein = null;


        try {
            // InternalTeSSLa.g:540:43: (iv_rulein= rulein EOF )
            // InternalTeSSLa.g:541:2: iv_rulein= rulein EOF
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
    // InternalTeSSLa.g:547:1: rulein returns [EObject current=null] : (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) ) ;
    public final EObject rulein() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:553:2: ( (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) ) )
            // InternalTeSSLa.g:554:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )
            {
            // InternalTeSSLa.g:554:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )
            // InternalTeSSLa.g:555:3: otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInAccess().getInKeyword_0());
              		
            }
            // InternalTeSSLa.g:559:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTeSSLa.g:560:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTeSSLa.g:560:4: (lv_name_1_0= RULE_ID )
            // InternalTeSSLa.g:561:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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
            // InternalTeSSLa.g:581:3: ( (lv_type_3_0= ruletype ) )
            // InternalTeSSLa.g:582:4: (lv_type_3_0= ruletype )
            {
            // InternalTeSSLa.g:582:4: (lv_type_3_0= ruletype )
            // InternalTeSSLa.g:583:5: lv_type_3_0= ruletype
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
    // InternalTeSSLa.g:604:1: entryRuletypedExpression returns [EObject current=null] : iv_ruletypedExpression= ruletypedExpression EOF ;
    public final EObject entryRuletypedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletypedExpression = null;


        try {
            // InternalTeSSLa.g:604:56: (iv_ruletypedExpression= ruletypedExpression EOF )
            // InternalTeSSLa.g:605:2: iv_ruletypedExpression= ruletypedExpression EOF
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
    // InternalTeSSLa.g:611:1: ruletypedExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )? ) ;
    public final EObject ruletypedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:617:2: ( ( ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )? ) )
            // InternalTeSSLa.g:618:2: ( ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )? )
            {
            // InternalTeSSLa.g:618:2: ( ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )? )
            // InternalTeSSLa.g:619:3: ( (lv_exp_0_0= ruleexpression ) ) (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )?
            {
            // InternalTeSSLa.g:619:3: ( (lv_exp_0_0= ruleexpression ) )
            // InternalTeSSLa.g:620:4: (lv_exp_0_0= ruleexpression )
            {
            // InternalTeSSLa.g:620:4: (lv_exp_0_0= ruleexpression )
            // InternalTeSSLa.g:621:5: lv_exp_0_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedExpressionAccess().getExpExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            // InternalTeSSLa.g:638:3: (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred13_InternalTeSSLa()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalTeSSLa.g:639:4: otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypedExpressionAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalTeSSLa.g:643:4: ( (lv_type_2_0= ruletype ) )
                    // InternalTeSSLa.g:644:5: (lv_type_2_0= ruletype )
                    {
                    // InternalTeSSLa.g:644:5: (lv_type_2_0= ruletype )
                    // InternalTeSSLa.g:645:6: lv_type_2_0= ruletype
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
    // InternalTeSSLa.g:667:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalTeSSLa.g:667:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalTeSSLa.g:668:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalTeSSLa.g:674:1: ruleexpression returns [EObject current=null] : ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruletypedExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruletypedExpression ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) ) )? ) | (this_value_7= rulevalue ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )* ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_if_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;

        EObject this_value_7 = null;

        AntlrDatatypeRuleToken lv_op_9_0 = null;

        EObject lv_right_10_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:680:2: ( ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruletypedExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruletypedExpression ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) ) )? ) | (this_value_7= rulevalue ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )* ) ) )
            // InternalTeSSLa.g:681:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruletypedExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruletypedExpression ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) ) )? ) | (this_value_7= rulevalue ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )* ) )
            {
            // InternalTeSSLa.g:681:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruletypedExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruletypedExpression ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) ) )? ) | (this_value_7= rulevalue ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )* ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==15||LA14_0==24||(LA14_0>=26 && LA14_0<=28)||LA14_0==43||(LA14_0>=48 && LA14_0<=49)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTeSSLa.g:682:3: ( () otherlv_1= 'if' ( (lv_if_2_0= ruletypedExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruletypedExpression ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) ) )? )
                    {
                    // InternalTeSSLa.g:682:3: ( () otherlv_1= 'if' ( (lv_if_2_0= ruletypedExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruletypedExpression ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) ) )? )
                    // InternalTeSSLa.g:683:4: () otherlv_1= 'if' ( (lv_if_2_0= ruletypedExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruletypedExpression ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) ) )?
                    {
                    // InternalTeSSLa.g:683:4: ()
                    // InternalTeSSLa.g:684:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExpressionAccess().getIfStatementAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getIfKeyword_0_1());
                      			
                    }
                    // InternalTeSSLa.g:697:4: ( (lv_if_2_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:698:5: (lv_if_2_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:698:5: (lv_if_2_0= ruletypedExpression )
                    // InternalTeSSLa.g:699:6: lv_if_2_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getIfTypedExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_if_2_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"if",
                      							lv_if_2_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getThenKeyword_0_3());
                      			
                    }
                    // InternalTeSSLa.g:720:4: ( (lv_then_4_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:721:5: (lv_then_4_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:721:5: (lv_then_4_0= ruletypedExpression )
                    // InternalTeSSLa.g:722:6: lv_then_4_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getThenTypedExpressionParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_then_4_0=ruletypedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"then",
                      							lv_then_4_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.typedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTeSSLa.g:739:4: (otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred14_InternalTeSSLa()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalTeSSLa.g:740:5: otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) )
                            {
                            otherlv_5=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getElseKeyword_0_5_0());
                              				
                            }
                            // InternalTeSSLa.g:744:5: ( (lv_else_6_0= ruletypedExpression ) )
                            // InternalTeSSLa.g:745:6: (lv_else_6_0= ruletypedExpression )
                            {
                            // InternalTeSSLa.g:745:6: (lv_else_6_0= ruletypedExpression )
                            // InternalTeSSLa.g:746:7: lv_else_6_0= ruletypedExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpressionAccess().getElseTypedExpressionParserRuleCall_0_5_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_else_6_0=ruletypedExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpressionRule());
                              							}
                              							set(
                              								current,
                              								"else",
                              								lv_else_6_0,
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
                    // InternalTeSSLa.g:766:3: (this_value_7= rulevalue ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )* )
                    {
                    // InternalTeSSLa.g:766:3: (this_value_7= rulevalue ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )* )
                    // InternalTeSSLa.g:767:4: this_value_7= rulevalue ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getValueParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    this_value_7=rulevalue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_value_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTeSSLa.g:778:4: ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        alt13 = dfa13.predict(input);
                        switch (alt13) {
                    	case 1 :
                    	    // InternalTeSSLa.g:779:5: () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) )
                    	    {
                    	    // InternalTeSSLa.g:779:5: ()
                    	    // InternalTeSSLa.g:780:6: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						/* */
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						current = forceCreateModelElementAndSet(
                    	      							grammarAccess.getExpressionAccess().getOperationLeftAction_1_1_0(),
                    	      							current);
                    	      					
                    	    }

                    	    }

                    	    // InternalTeSSLa.g:789:5: ( (lv_op_9_0= ruleinfixOperator ) )
                    	    // InternalTeSSLa.g:790:6: (lv_op_9_0= ruleinfixOperator )
                    	    {
                    	    // InternalTeSSLa.g:790:6: (lv_op_9_0= ruleinfixOperator )
                    	    // InternalTeSSLa.g:791:7: lv_op_9_0= ruleinfixOperator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExpressionAccess().getOpInfixOperatorParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_op_9_0=ruleinfixOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"op",
                    	      								lv_op_9_0,
                    	      								"de.uniluebeck.isp.tessla.TeSSLa.infixOperator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalTeSSLa.g:808:5: ( (lv_right_10_0= rulevalue ) )
                    	    // InternalTeSSLa.g:809:6: (lv_right_10_0= rulevalue )
                    	    {
                    	    // InternalTeSSLa.g:809:6: (lv_right_10_0= rulevalue )
                    	    // InternalTeSSLa.g:810:7: lv_right_10_0= rulevalue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExpressionAccess().getRightValueParserRuleCall_1_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_right_10_0=rulevalue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"right",
                    	      								lv_right_10_0,
                    	      								"de.uniluebeck.isp.tessla.TeSSLa.value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
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
    // InternalTeSSLa.g:833:1: entryRulevalue returns [EObject current=null] : iv_rulevalue= rulevalue EOF ;
    public final EObject entryRulevalue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue = null;


        try {
            // InternalTeSSLa.g:833:46: (iv_rulevalue= rulevalue EOF )
            // InternalTeSSLa.g:834:2: iv_rulevalue= rulevalue EOF
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
    // InternalTeSSLa.g:840:1: rulevalue returns [EObject current=null] : ( () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | this_STRING_17= RULE_STRING | this_INT_18= RULE_INT | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' ) ) ;
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
        Token this_STRING_17=null;
        Token this_INT_18=null;
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
            // InternalTeSSLa.g:846:2: ( ( () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | this_STRING_17= RULE_STRING | this_INT_18= RULE_INT | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' ) ) )
            // InternalTeSSLa.g:847:2: ( () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | this_STRING_17= RULE_STRING | this_INT_18= RULE_INT | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' ) )
            {
            // InternalTeSSLa.g:847:2: ( () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | this_STRING_17= RULE_STRING | this_INT_18= RULE_INT | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' ) )
            // InternalTeSSLa.g:848:3: () ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | this_STRING_17= RULE_STRING | this_INT_18= RULE_INT | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' )
            {
            // InternalTeSSLa.g:848:3: ()
            // InternalTeSSLa.g:849:4: 
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

            // InternalTeSSLa.g:858:3: ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | this_STRING_17= RULE_STRING | this_INT_18= RULE_INT | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' )
            int alt18=10;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalTeSSLa.g:859:4: ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) )
                    {
                    // InternalTeSSLa.g:859:4: ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) )
                    // InternalTeSSLa.g:860:5: ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) )
                    {
                    // InternalTeSSLa.g:860:5: ( (lv_op_1_0= ruleunaryOperator ) )
                    // InternalTeSSLa.g:861:6: (lv_op_1_0= ruleunaryOperator )
                    {
                    // InternalTeSSLa.g:861:6: (lv_op_1_0= ruleunaryOperator )
                    // InternalTeSSLa.g:862:7: lv_op_1_0= ruleunaryOperator
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

                    // InternalTeSSLa.g:879:5: ( (lv_exp_2_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:880:6: (lv_exp_2_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:880:6: (lv_exp_2_0= ruletypedExpression )
                    // InternalTeSSLa.g:881:7: lv_exp_2_0= ruletypedExpression
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
                    // InternalTeSSLa.g:900:4: (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' )
                    {
                    // InternalTeSSLa.g:900:4: (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' )
                    // InternalTeSSLa.g:901:5: otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getValueAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalTeSSLa.g:905:5: ( (lv_exp_4_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:906:6: (lv_exp_4_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:906:6: (lv_exp_4_0= ruletypedExpression )
                    // InternalTeSSLa.g:907:7: lv_exp_4_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getValueAccess().getExpTypedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_11);
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

                    otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getValueAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:930:4: (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' )
                    {
                    // InternalTeSSLa.g:930:4: (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' )
                    // InternalTeSSLa.g:931:5: otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_1_2_0());
                      				
                    }
                    // InternalTeSSLa.g:935:5: ( (lv_statements_7_0= ruleStatement ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_SL_COMMENT||(LA15_0>=11 && LA15_0<=12)||LA15_0==18||LA15_0==20) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalTeSSLa.g:936:6: (lv_statements_7_0= ruleStatement )
                    	    {
                    	    // InternalTeSSLa.g:936:6: (lv_statements_7_0= ruleStatement )
                    	    // InternalTeSSLa.g:937:7: lv_statements_7_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getValueAccess().getStatementsStatementParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_statements_7_0=ruleStatement();

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
                    	      								"de.uniluebeck.isp.tessla.TeSSLa.Statement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // InternalTeSSLa.g:954:5: ( (lv_exp_8_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:955:6: (lv_exp_8_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:955:6: (lv_exp_8_0= ruletypedExpression )
                    // InternalTeSSLa.g:956:7: lv_exp_8_0= ruletypedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getValueAccess().getExpTypedExpressionParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_19);
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

                    otherlv_9=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_1_2_3());
                      				
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTeSSLa.g:979:4: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' )
                    {
                    // InternalTeSSLa.g:979:4: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' )
                    // InternalTeSSLa.g:980:5: ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')'
                    {
                    // InternalTeSSLa.g:980:5: ( (lv_name_10_0= RULE_ID ) )
                    // InternalTeSSLa.g:981:6: (lv_name_10_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:981:6: (lv_name_10_0= RULE_ID )
                    // InternalTeSSLa.g:982:7: lv_name_10_0= RULE_ID
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

                    otherlv_11=(Token)match(input,15,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getValueAccess().getLeftParenthesisKeyword_1_3_1());
                      				
                    }
                    // InternalTeSSLa.g:1002:5: ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==15||LA17_0==21||LA17_0==24||(LA17_0>=26 && LA17_0<=28)||LA17_0==43||(LA17_0>=48 && LA17_0<=49)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalTeSSLa.g:1003:6: ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )*
                            {
                            // InternalTeSSLa.g:1003:6: ( (lv_args_12_0= rulearg ) )
                            // InternalTeSSLa.g:1004:7: (lv_args_12_0= rulearg )
                            {
                            // InternalTeSSLa.g:1004:7: (lv_args_12_0= rulearg )
                            // InternalTeSSLa.g:1005:8: lv_args_12_0= rulearg
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_10);
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

                            // InternalTeSSLa.g:1022:6: (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==16) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalTeSSLa.g:1023:7: otherlv_13= ',' ( (lv_args_14_0= rulearg ) )
                            	    {
                            	    otherlv_13=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_13, grammarAccess.getValueAccess().getCommaKeyword_1_3_2_1_0());
                            	      						
                            	    }
                            	    // InternalTeSSLa.g:1027:7: ( (lv_args_14_0= rulearg ) )
                            	    // InternalTeSSLa.g:1028:8: (lv_args_14_0= rulearg )
                            	    {
                            	    // InternalTeSSLa.g:1028:8: (lv_args_14_0= rulearg )
                            	    // InternalTeSSLa.g:1029:9: lv_args_14_0= rulearg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_10);
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
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getValueAccess().getRightParenthesisKeyword_1_3_3());
                      				
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTeSSLa.g:1054:4: ( (lv_name_16_0= RULE_ID ) )
                    {
                    // InternalTeSSLa.g:1054:4: ( (lv_name_16_0= RULE_ID ) )
                    // InternalTeSSLa.g:1055:5: (lv_name_16_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:1055:5: (lv_name_16_0= RULE_ID )
                    // InternalTeSSLa.g:1056:6: lv_name_16_0= RULE_ID
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
                    // InternalTeSSLa.g:1073:4: this_STRING_17= RULE_STRING
                    {
                    this_STRING_17=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_STRING_17, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalTeSSLa.g:1078:4: this_INT_18= RULE_INT
                    {
                    this_INT_18=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_18, grammarAccess.getValueAccess().getINTTerminalRuleCall_1_6());
                      			
                    }

                    }
                    break;
                case 8 :
                    // InternalTeSSLa.g:1083:4: otherlv_19= '()'
                    {
                    otherlv_19=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getValueAccess().getLeftParenthesisRightParenthesisKeyword_1_7());
                      			
                    }

                    }
                    break;
                case 9 :
                    // InternalTeSSLa.g:1088:4: otherlv_20= 'true'
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getValueAccess().getTrueKeyword_1_8());
                      			
                    }

                    }
                    break;
                case 10 :
                    // InternalTeSSLa.g:1093:4: otherlv_21= 'false'
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
    // InternalTeSSLa.g:1102:1: entryRulearg returns [EObject current=null] : iv_rulearg= rulearg EOF ;
    public final EObject entryRulearg() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearg = null;


        try {
            // InternalTeSSLa.g:1102:44: (iv_rulearg= rulearg EOF )
            // InternalTeSSLa.g:1103:2: iv_rulearg= rulearg EOF
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
    // InternalTeSSLa.g:1109:1: rulearg returns [EObject current=null] : ( ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) ) | ( (lv_exp_3_0= ruletypedExpression ) ) ) ;
    public final EObject rulearg() throws RecognitionException {
        EObject current = null;

        Token lv_arg_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:1115:2: ( ( ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) ) | ( (lv_exp_3_0= ruletypedExpression ) ) ) )
            // InternalTeSSLa.g:1116:2: ( ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) ) | ( (lv_exp_3_0= ruletypedExpression ) ) )
            {
            // InternalTeSSLa.g:1116:2: ( ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) ) | ( (lv_exp_3_0= ruletypedExpression ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==29) ) {
                    alt19=1;
                }
                else if ( (LA19_1==EOF||LA19_1==13||(LA19_1>=15 && LA19_1<=17)||(LA19_1>=30 && LA19_1<=47)) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_INT)||LA19_0==15||LA19_0==21||LA19_0==24||(LA19_0>=26 && LA19_0<=28)||LA19_0==43||(LA19_0>=48 && LA19_0<=49)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalTeSSLa.g:1117:3: ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) )
                    {
                    // InternalTeSSLa.g:1117:3: ( ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) ) )
                    // InternalTeSSLa.g:1118:4: ( (lv_arg_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruletypedExpression ) )
                    {
                    // InternalTeSSLa.g:1118:4: ( (lv_arg_0_0= RULE_ID ) )
                    // InternalTeSSLa.g:1119:5: (lv_arg_0_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:1119:5: (lv_arg_0_0= RULE_ID )
                    // InternalTeSSLa.g:1120:6: lv_arg_0_0= RULE_ID
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
                    // InternalTeSSLa.g:1140:4: ( (lv_exp_2_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:1141:5: (lv_exp_2_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:1141:5: (lv_exp_2_0= ruletypedExpression )
                    // InternalTeSSLa.g:1142:6: lv_exp_2_0= ruletypedExpression
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
                    // InternalTeSSLa.g:1161:3: ( (lv_exp_3_0= ruletypedExpression ) )
                    {
                    // InternalTeSSLa.g:1161:3: ( (lv_exp_3_0= ruletypedExpression ) )
                    // InternalTeSSLa.g:1162:4: (lv_exp_3_0= ruletypedExpression )
                    {
                    // InternalTeSSLa.g:1162:4: (lv_exp_3_0= ruletypedExpression )
                    // InternalTeSSLa.g:1163:5: lv_exp_3_0= ruletypedExpression
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
    // InternalTeSSLa.g:1184:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // InternalTeSSLa.g:1184:44: (iv_ruletype= ruletype EOF )
            // InternalTeSSLa.g:1185:2: iv_ruletype= ruletype EOF
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
    // InternalTeSSLa.g:1191:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_6=null;
        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_type_4 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:1197:2: ( ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID ) )
            // InternalTeSSLa.g:1198:2: ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID )
            {
            // InternalTeSSLa.g:1198:2: ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred31_InternalTeSSLa()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTeSSLa.g:1199:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
                    {
                    // InternalTeSSLa.g:1199:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
                    // InternalTeSSLa.g:1200:4: this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>'
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
                    // InternalTeSSLa.g:1222:4: (kw= ',' this_type_4= ruletype )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalTeSSLa.g:1223:5: kw= ',' this_type_4= ruletype
                    	    {
                    	    kw=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
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
                    	    break loop20;
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
                    // InternalTeSSLa.g:1246:3: this_ID_6= RULE_ID
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
    // InternalTeSSLa.g:1257:1: entryRuleinfixOperator returns [String current=null] : iv_ruleinfixOperator= ruleinfixOperator EOF ;
    public final String entryRuleinfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinfixOperator = null;


        try {
            // InternalTeSSLa.g:1257:53: (iv_ruleinfixOperator= ruleinfixOperator EOF )
            // InternalTeSSLa.g:1258:2: iv_ruleinfixOperator= ruleinfixOperator EOF
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
    // InternalTeSSLa.g:1264:1: ruleinfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '&&' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleinfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTeSSLa.g:1270:2: ( (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '&&' | kw= '||' ) )
            // InternalTeSSLa.g:1271:2: (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '&&' | kw= '||' )
            {
            // InternalTeSSLa.g:1271:2: (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '&&' | kw= '||' )
            int alt22=18;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt22=1;
                }
                break;
            case 33:
                {
                alt22=2;
                }
                break;
            case 34:
                {
                alt22=3;
                }
                break;
            case 35:
                {
                alt22=4;
                }
                break;
            case 36:
                {
                alt22=5;
                }
                break;
            case 30:
                {
                alt22=6;
                }
                break;
            case 31:
                {
                alt22=7;
                }
                break;
            case 37:
                {
                alt22=8;
                }
                break;
            case 38:
                {
                alt22=9;
                }
                break;
            case 39:
                {
                alt22=10;
                }
                break;
            case 40:
                {
                alt22=11;
                }
                break;
            case 41:
                {
                alt22=12;
                }
                break;
            case 42:
                {
                alt22=13;
                }
                break;
            case 43:
                {
                alt22=14;
                }
                break;
            case 44:
                {
                alt22=15;
                }
                break;
            case 45:
                {
                alt22=16;
                }
                break;
            case 46:
                {
                alt22=17;
                }
                break;
            case 47:
                {
                alt22=18;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalTeSSLa.g:1272:3: kw= '%'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getPercentSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:1278:3: kw= '<<'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignLessThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:1284:3: kw= '>>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTeSSLa.g:1290:3: kw= '>='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTeSSLa.g:1296:3: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTeSSLa.g:1302:3: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalTeSSLa.g:1308:3: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalTeSSLa.g:1314:3: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getExclamationMarkEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalTeSSLa.g:1320:3: kw= '=='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getEqualsSignEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalTeSSLa.g:1326:3: kw= '&'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAmpersandKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalTeSSLa.g:1332:3: kw= '|'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getVerticalLineKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalTeSSLa.g:1338:3: kw= '^'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getCircumflexAccentKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalTeSSLa.g:1344:3: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getPlusSignKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalTeSSLa.g:1350:3: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getHyphenMinusKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalTeSSLa.g:1356:3: kw= '*'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAsteriskKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalTeSSLa.g:1362:3: kw= '/'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getSolidusKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalTeSSLa.g:1368:3: kw= '&&'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAmpersandAmpersandKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalTeSSLa.g:1374:3: kw= '||'
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
    // InternalTeSSLa.g:1383:1: entryRuleunaryOperator returns [String current=null] : iv_ruleunaryOperator= ruleunaryOperator EOF ;
    public final String entryRuleunaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunaryOperator = null;


        try {
            // InternalTeSSLa.g:1383:53: (iv_ruleunaryOperator= ruleunaryOperator EOF )
            // InternalTeSSLa.g:1384:2: iv_ruleunaryOperator= ruleunaryOperator EOF
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
    // InternalTeSSLa.g:1390:1: ruleunaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '~' | kw= '-' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleunaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTeSSLa.g:1396:2: ( (kw= '~' | kw= '-' | kw= '!' ) )
            // InternalTeSSLa.g:1397:2: (kw= '~' | kw= '-' | kw= '!' )
            {
            // InternalTeSSLa.g:1397:2: (kw= '~' | kw= '-' | kw= '!' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt23=1;
                }
                break;
            case 43:
                {
                alt23=2;
                }
                break;
            case 49:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalTeSSLa.g:1398:3: kw= '~'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:1404:3: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:1410:3: kw= '!'
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

    // $ANTLR start synpred13_InternalTeSSLa
    public final void synpred13_InternalTeSSLa_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


        // InternalTeSSLa.g:639:4: (otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
        // InternalTeSSLa.g:639:4: otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
        {
        otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return ;
        // InternalTeSSLa.g:643:4: ( (lv_type_2_0= ruletype ) )
        // InternalTeSSLa.g:644:5: (lv_type_2_0= ruletype )
        {
        // InternalTeSSLa.g:644:5: (lv_type_2_0= ruletype )
        // InternalTeSSLa.g:645:6: lv_type_2_0= ruletype
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
    // $ANTLR end synpred13_InternalTeSSLa

    // $ANTLR start synpred14_InternalTeSSLa
    public final void synpred14_InternalTeSSLa_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_else_6_0 = null;


        // InternalTeSSLa.g:740:5: (otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) ) )
        // InternalTeSSLa.g:740:5: otherlv_5= 'else' ( (lv_else_6_0= ruletypedExpression ) )
        {
        otherlv_5=(Token)match(input,23,FOLLOW_8); if (state.failed) return ;
        // InternalTeSSLa.g:744:5: ( (lv_else_6_0= ruletypedExpression ) )
        // InternalTeSSLa.g:745:6: (lv_else_6_0= ruletypedExpression )
        {
        // InternalTeSSLa.g:745:6: (lv_else_6_0= ruletypedExpression )
        // InternalTeSSLa.g:746:7: lv_else_6_0= ruletypedExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getElseTypedExpressionParserRuleCall_0_5_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_else_6_0=ruletypedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalTeSSLa

    // $ANTLR start synpred16_InternalTeSSLa
    public final void synpred16_InternalTeSSLa_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_op_9_0 = null;

        EObject lv_right_10_0 = null;


        // InternalTeSSLa.g:779:5: ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )
        // InternalTeSSLa.g:779:5: () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) )
        {
        // InternalTeSSLa.g:779:5: ()
        // InternalTeSSLa.g:780:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalTeSSLa.g:789:5: ( (lv_op_9_0= ruleinfixOperator ) )
        // InternalTeSSLa.g:790:6: (lv_op_9_0= ruleinfixOperator )
        {
        // InternalTeSSLa.g:790:6: (lv_op_9_0= ruleinfixOperator )
        // InternalTeSSLa.g:791:7: lv_op_9_0= ruleinfixOperator
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getOpInfixOperatorParserRuleCall_1_1_1_0());
          						
        }
        pushFollow(FOLLOW_8);
        lv_op_9_0=ruleinfixOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalTeSSLa.g:808:5: ( (lv_right_10_0= rulevalue ) )
        // InternalTeSSLa.g:809:6: (lv_right_10_0= rulevalue )
        {
        // InternalTeSSLa.g:809:6: (lv_right_10_0= rulevalue )
        // InternalTeSSLa.g:810:7: lv_right_10_0= rulevalue
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getRightValueParserRuleCall_1_1_2_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_right_10_0=rulevalue();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalTeSSLa

    // $ANTLR start synpred23_InternalTeSSLa
    public final void synpred23_InternalTeSSLa_fragment() throws RecognitionException {   
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_args_12_0 = null;

        EObject lv_args_14_0 = null;


        // InternalTeSSLa.g:979:4: ( ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) )
        // InternalTeSSLa.g:979:4: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' )
        {
        // InternalTeSSLa.g:979:4: ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' )
        // InternalTeSSLa.g:980:5: ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')'
        {
        // InternalTeSSLa.g:980:5: ( (lv_name_10_0= RULE_ID ) )
        // InternalTeSSLa.g:981:6: (lv_name_10_0= RULE_ID )
        {
        // InternalTeSSLa.g:981:6: (lv_name_10_0= RULE_ID )
        // InternalTeSSLa.g:982:7: lv_name_10_0= RULE_ID
        {
        lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,15,FOLLOW_21); if (state.failed) return ;
        // InternalTeSSLa.g:1002:5: ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )?
        int alt32=2;
        int LA32_0 = input.LA(1);

        if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INT)||LA32_0==15||LA32_0==21||LA32_0==24||(LA32_0>=26 && LA32_0<=28)||LA32_0==43||(LA32_0>=48 && LA32_0<=49)) ) {
            alt32=1;
        }
        switch (alt32) {
            case 1 :
                // InternalTeSSLa.g:1003:6: ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )*
                {
                // InternalTeSSLa.g:1003:6: ( (lv_args_12_0= rulearg ) )
                // InternalTeSSLa.g:1004:7: (lv_args_12_0= rulearg )
                {
                // InternalTeSSLa.g:1004:7: (lv_args_12_0= rulearg )
                // InternalTeSSLa.g:1005:8: lv_args_12_0= rulearg
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_0_0());
                  							
                }
                pushFollow(FOLLOW_10);
                lv_args_12_0=rulearg();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalTeSSLa.g:1022:6: (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )*
                loop31:
                do {
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==16) ) {
                        alt31=1;
                    }


                    switch (alt31) {
                	case 1 :
                	    // InternalTeSSLa.g:1023:7: otherlv_13= ',' ( (lv_args_14_0= rulearg ) )
                	    {
                	    otherlv_13=(Token)match(input,16,FOLLOW_8); if (state.failed) return ;
                	    // InternalTeSSLa.g:1027:7: ( (lv_args_14_0= rulearg ) )
                	    // InternalTeSSLa.g:1028:8: (lv_args_14_0= rulearg )
                	    {
                	    // InternalTeSSLa.g:1028:8: (lv_args_14_0= rulearg )
                	    // InternalTeSSLa.g:1029:9: lv_args_14_0= rulearg
                	    {
                	    if ( state.backtracking==0 ) {

                	      									newCompositeNode(grammarAccess.getValueAccess().getArgsArgParserRuleCall_1_3_2_1_1_0());
                	      								
                	    }
                	    pushFollow(FOLLOW_10);
                	    lv_args_14_0=rulearg();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop31;
                    }
                } while (true);


                }
                break;

        }

        otherlv_15=(Token)match(input,17,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalTeSSLa

    // $ANTLR start synpred24_InternalTeSSLa
    public final void synpred24_InternalTeSSLa_fragment() throws RecognitionException {   
        Token lv_name_16_0=null;

        // InternalTeSSLa.g:1054:4: ( ( (lv_name_16_0= RULE_ID ) ) )
        // InternalTeSSLa.g:1054:4: ( (lv_name_16_0= RULE_ID ) )
        {
        // InternalTeSSLa.g:1054:4: ( (lv_name_16_0= RULE_ID ) )
        // InternalTeSSLa.g:1055:5: (lv_name_16_0= RULE_ID )
        {
        // InternalTeSSLa.g:1055:5: (lv_name_16_0= RULE_ID )
        // InternalTeSSLa.g:1056:6: lv_name_16_0= RULE_ID
        {
        lv_name_16_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalTeSSLa

    // $ANTLR start synpred31_InternalTeSSLa
    public final void synpred31_InternalTeSSLa_fragment() throws RecognitionException {   
        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_type_4 = null;


        // InternalTeSSLa.g:1199:3: ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) )
        // InternalTeSSLa.g:1199:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
        {
        // InternalTeSSLa.g:1199:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
        // InternalTeSSLa.g:1200:4: this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>'
        {
        this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return ;
        kw=(Token)match(input,30,FOLLOW_4); if (state.failed) return ;
        pushFollow(FOLLOW_24);
        this_type_2=ruletype();

        state._fsp--;
        if (state.failed) return ;
        // InternalTeSSLa.g:1222:4: (kw= ',' this_type_4= ruletype )*
        loop33:
        do {
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }


            switch (alt33) {
        	case 1 :
        	    // InternalTeSSLa.g:1223:5: kw= ',' this_type_4= ruletype
        	    {
        	    kw=(Token)match(input,16,FOLLOW_4); if (state.failed) return ;
        	    pushFollow(FOLLOW_24);
        	    this_type_4=ruletype();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop33;
            }
        } while (true);

        kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalTeSSLa

    // Delegated rules

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
    public final boolean synpred31_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\1\24\uffff";
    static final String dfa_3s = "\1\4\1\uffff\22\0\1\uffff";
    static final String dfa_4s = "\1\61\1\uffff\22\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\22\uffff\1\1";
    static final String dfa_6s = "\2\uffff\1\10\1\11\1\5\1\0\1\16\1\12\1\6\1\1\1\17\1\13\1\7\1\2\1\20\1\14\1\3\1\21\1\15\1\4\1\uffff}>";
    static final String[] dfa_7s = {
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 778:4: ( () ( (lv_op_9_0= ruleinfixOperator ) ) ( (lv_right_10_0= rulevalue ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_13 = input.LA(1);

                         
                        int index13_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_16 = input.LA(1);

                         
                        int index13_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_19 = input.LA(1);

                         
                        int index13_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_19);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_12 = input.LA(1);

                         
                        int index13_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_11 = input.LA(1);

                         
                        int index13_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA13_15 = input.LA(1);

                         
                        int index13_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA13_18 = input.LA(1);

                         
                        int index13_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_18);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA13_10 = input.LA(1);

                         
                        int index13_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_10);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA13_14 = input.LA(1);

                         
                        int index13_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_14);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA13_17 = input.LA(1);

                         
                        int index13_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTeSSLa()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\5\5\uffff\1\0\7\uffff";
    static final String dfa_10s = "\1\61\5\uffff\1\0\7\uffff";
    static final String dfa_11s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\4\1\5";
    static final String dfa_12s = "\6\uffff\1\0\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\1\7\1\10\7\uffff\1\4\10\uffff\1\5\1\uffff\1\11\1\12\1\13\16\uffff\1\1\4\uffff\2\1",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "858:3: ( ( ( (lv_op_1_0= ruleunaryOperator ) ) ( (lv_exp_2_0= ruletypedExpression ) ) ) | (otherlv_3= '(' ( (lv_exp_4_0= ruletypedExpression ) ) otherlv_5= ')' ) | (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* ( (lv_exp_8_0= ruletypedExpression ) ) otherlv_9= '}' ) | ( ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_args_12_0= rulearg ) ) (otherlv_13= ',' ( (lv_args_14_0= rulearg ) ) )* )? otherlv_15= ')' ) | ( (lv_name_16_0= RULE_ID ) ) | this_STRING_17= RULE_STRING | this_INT_18= RULE_INT | otherlv_19= '()' | otherlv_20= 'true' | otherlv_21= 'false' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalTeSSLa()) ) {s = 12;}

                        else if ( (synpred24_InternalTeSSLa()) ) {s = 13;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000141812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000308001D2080E0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000FFFFC0000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000308001D3498F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000308001D2280E0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080010000L});

}
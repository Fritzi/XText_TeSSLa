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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'define'", "':'", "':='", "'{'", "'}'", "'('", "','", "')'", "'out'", "'as'", "'in'", "'if'", "'then'", "'else'", "'='", "'()'", "'true'", "'false'", "'<'", "'>'", "'%'", "'<<'", "'>>'", "'>='", "'<='", "'!='", "'=='", "'&'", "'|'", "'^'", "'+'", "'-'", "'*'", "'/'", "'~'", "'!'"
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
    // InternalTeSSLa.g:113:1: rulestatement returns [EObject current=null] : (this_definition_0= ruledefinition | this_out_1= ruleout | this_in_2= rulein | this_SL_COMMENT_3= RULE_SL_COMMENT ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_3=null;
        EObject this_definition_0 = null;

        EObject this_out_1 = null;

        EObject this_in_2 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:119:2: ( (this_definition_0= ruledefinition | this_out_1= ruleout | this_in_2= rulein | this_SL_COMMENT_3= RULE_SL_COMMENT ) )
            // InternalTeSSLa.g:120:2: (this_definition_0= ruledefinition | this_out_1= ruleout | this_in_2= rulein | this_SL_COMMENT_3= RULE_SL_COMMENT )
            {
            // InternalTeSSLa.g:120:2: (this_definition_0= ruledefinition | this_out_1= ruleout | this_in_2= rulein | this_SL_COMMENT_3= RULE_SL_COMMENT )
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
                    // InternalTeSSLa.g:121:3: this_definition_0= ruledefinition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_definition_0=ruledefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_definition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:133:3: this_out_1= ruleout
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getOutParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_out_1=ruleout();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_out_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:145:3: this_in_2= rulein
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getInParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_in_2=rulein();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_in_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTeSSLa.g:157:3: this_SL_COMMENT_3= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SL_COMMENT_3, grammarAccess.getStatementAccess().getSL_COMMENTTerminalRuleCall_3());
                      		
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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuledefinition"
    // InternalTeSSLa.g:165:1: entryRuledefinition returns [EObject current=null] : iv_ruledefinition= ruledefinition EOF ;
    public final EObject entryRuledefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledefinition = null;


        try {
            // InternalTeSSLa.g:165:51: (iv_ruledefinition= ruledefinition EOF )
            // InternalTeSSLa.g:166:2: iv_ruledefinition= ruledefinition EOF
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
    // InternalTeSSLa.g:172:1: ruledefinition returns [EObject current=null] : ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruleexpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) ) ) ;
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
            // InternalTeSSLa.g:178:2: ( ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruleexpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) ) ) )
            // InternalTeSSLa.g:179:2: ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruleexpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) ) )
            {
            // InternalTeSSLa.g:179:2: ( (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruleexpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) ) )
            // InternalTeSSLa.g:180:3: (otherlv_0= 'def' | otherlv_1= 'define' ) ( (lv_def_2_0= RULE_ID ) ) ( (lv_paramList_3_0= ruleparamList ) )? (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )? otherlv_6= ':=' ( ( (lv_expression_7_0= ruleexpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) )
            {
            // InternalTeSSLa.g:180:3: (otherlv_0= 'def' | otherlv_1= 'define' )
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
                    // InternalTeSSLa.g:181:4: otherlv_0= 'def'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:186:4: otherlv_1= 'define'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getDefineKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalTeSSLa.g:191:3: ( (lv_def_2_0= RULE_ID ) )
            // InternalTeSSLa.g:192:4: (lv_def_2_0= RULE_ID )
            {
            // InternalTeSSLa.g:192:4: (lv_def_2_0= RULE_ID )
            // InternalTeSSLa.g:193:5: lv_def_2_0= RULE_ID
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

            // InternalTeSSLa.g:209:3: ( (lv_paramList_3_0= ruleparamList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTeSSLa.g:210:4: (lv_paramList_3_0= ruleparamList )
                    {
                    // InternalTeSSLa.g:210:4: (lv_paramList_3_0= ruleparamList )
                    // InternalTeSSLa.g:211:5: lv_paramList_3_0= ruleparamList
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

            // InternalTeSSLa.g:228:3: (otherlv_4= ':' ( (lv_type_5_0= ruletype ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTeSSLa.g:229:4: otherlv_4= ':' ( (lv_type_5_0= ruletype ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getColonKeyword_3_0());
                      			
                    }
                    // InternalTeSSLa.g:233:4: ( (lv_type_5_0= ruletype ) )
                    // InternalTeSSLa.g:234:5: (lv_type_5_0= ruletype )
                    {
                    // InternalTeSSLa.g:234:5: (lv_type_5_0= ruletype )
                    // InternalTeSSLa.g:235:6: lv_type_5_0= ruletype
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
            // InternalTeSSLa.g:257:3: ( ( (lv_expression_7_0= ruleexpression ) ) | (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==23||(LA7_0>=27 && LA7_0<=29)||LA7_0==43||(LA7_0>=46 && LA7_0<=47)) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTeSSLa.g:258:4: ( (lv_expression_7_0= ruleexpression ) )
                    {
                    // InternalTeSSLa.g:258:4: ( (lv_expression_7_0= ruleexpression ) )
                    // InternalTeSSLa.g:259:5: (lv_expression_7_0= ruleexpression )
                    {
                    // InternalTeSSLa.g:259:5: (lv_expression_7_0= ruleexpression )
                    // InternalTeSSLa.g:260:6: lv_expression_7_0= ruleexpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_7_0=ruleexpression();

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
                      							"de.uniluebeck.isp.tessla.TeSSLa.expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:278:4: (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' )
                    {
                    // InternalTeSSLa.g:278:4: (otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}' )
                    // InternalTeSSLa.g:279:5: otherlv_8= '{' ( (lv_statements_9_0= rulestatement ) )* ( (lv_expression_10_0= ruleexpression ) ) otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalTeSSLa.g:283:5: ( (lv_statements_9_0= rulestatement ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_SL_COMMENT||(LA6_0>=11 && LA6_0<=12)||LA6_0==20||LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTeSSLa.g:284:6: (lv_statements_9_0= rulestatement )
                    	    {
                    	    // InternalTeSSLa.g:284:6: (lv_statements_9_0= rulestatement )
                    	    // InternalTeSSLa.g:285:7: lv_statements_9_0= rulestatement
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

                    // InternalTeSSLa.g:302:5: ( (lv_expression_10_0= ruleexpression ) )
                    // InternalTeSSLa.g:303:6: (lv_expression_10_0= ruleexpression )
                    {
                    // InternalTeSSLa.g:303:6: (lv_expression_10_0= ruleexpression )
                    // InternalTeSSLa.g:304:7: lv_expression_10_0= ruleexpression
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
    // InternalTeSSLa.g:331:1: entryRuleparamList returns [EObject current=null] : iv_ruleparamList= ruleparamList EOF ;
    public final EObject entryRuleparamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparamList = null;


        try {
            // InternalTeSSLa.g:331:50: (iv_ruleparamList= ruleparamList EOF )
            // InternalTeSSLa.g:332:2: iv_ruleparamList= ruleparamList EOF
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
    // InternalTeSSLa.g:338:1: ruleparamList returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | ( () otherlv_11= '(' otherlv_12= ')' ) ) ;
    public final EObject ruleparamList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_params_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_params_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_types_4_0 = null;

        AntlrDatatypeRuleToken lv_types_8_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:344:2: ( ( ( () otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | ( () otherlv_11= '(' otherlv_12= ')' ) ) )
            // InternalTeSSLa.g:345:2: ( ( () otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | ( () otherlv_11= '(' otherlv_12= ')' ) )
            {
            // InternalTeSSLa.g:345:2: ( ( () otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' ) | ( () otherlv_11= '(' otherlv_12= ')' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==19) ) {
                    alt11=2;
                }
                else if ( (LA11_1==RULE_ID) ) {
                    alt11=1;
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
                    // InternalTeSSLa.g:346:3: ( () otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' )
                    {
                    // InternalTeSSLa.g:346:3: ( () otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')' )
                    // InternalTeSSLa.g:347:4: () otherlv_1= '(' ( (lv_params_2_0= RULE_ID ) ) (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )* otherlv_9= ')'
                    {
                    // InternalTeSSLa.g:347:4: ()
                    // InternalTeSSLa.g:348:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getParamListAccess().getParamListAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParamListAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalTeSSLa.g:361:4: ( (lv_params_2_0= RULE_ID ) )
                    // InternalTeSSLa.g:362:5: (lv_params_2_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:362:5: (lv_params_2_0= RULE_ID )
                    // InternalTeSSLa.g:363:6: lv_params_2_0= RULE_ID
                    {
                    lv_params_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_params_2_0, grammarAccess.getParamListAccess().getParamsIDTerminalRuleCall_0_2_0());
                      					
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

                    // InternalTeSSLa.g:379:4: (otherlv_3= ':' ( (lv_types_4_0= ruletype ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==13) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalTeSSLa.g:380:5: otherlv_3= ':' ( (lv_types_4_0= ruletype ) )
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getParamListAccess().getColonKeyword_0_3_0());
                              				
                            }
                            // InternalTeSSLa.g:384:5: ( (lv_types_4_0= ruletype ) )
                            // InternalTeSSLa.g:385:6: (lv_types_4_0= ruletype )
                            {
                            // InternalTeSSLa.g:385:6: (lv_types_4_0= ruletype )
                            // InternalTeSSLa.g:386:7: lv_types_4_0= ruletype
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getParamListAccess().getTypesTypeParserRuleCall_0_3_1_0());
                              						
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

                    // InternalTeSSLa.g:404:4: (otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )? )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTeSSLa.g:405:5: otherlv_5= ',' ( (lv_params_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )?
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getParamListAccess().getCommaKeyword_0_4_0());
                    	      				
                    	    }
                    	    // InternalTeSSLa.g:409:5: ( (lv_params_6_0= RULE_ID ) )
                    	    // InternalTeSSLa.g:410:6: (lv_params_6_0= RULE_ID )
                    	    {
                    	    // InternalTeSSLa.g:410:6: (lv_params_6_0= RULE_ID )
                    	    // InternalTeSSLa.g:411:7: lv_params_6_0= RULE_ID
                    	    {
                    	    lv_params_6_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_params_6_0, grammarAccess.getParamListAccess().getParamsIDTerminalRuleCall_0_4_1_0());
                    	      						
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

                    	    // InternalTeSSLa.g:427:5: (otherlv_7= ':' ( (lv_types_8_0= ruletype ) ) )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==13) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalTeSSLa.g:428:6: otherlv_7= ':' ( (lv_types_8_0= ruletype ) )
                    	            {
                    	            otherlv_7=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_7, grammarAccess.getParamListAccess().getColonKeyword_0_4_2_0());
                    	              					
                    	            }
                    	            // InternalTeSSLa.g:432:6: ( (lv_types_8_0= ruletype ) )
                    	            // InternalTeSSLa.g:433:7: (lv_types_8_0= ruletype )
                    	            {
                    	            // InternalTeSSLa.g:433:7: (lv_types_8_0= ruletype )
                    	            // InternalTeSSLa.g:434:8: lv_types_8_0= ruletype
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getParamListAccess().getTypesTypeParserRuleCall_0_4_2_1_0());
                    	              							
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

                      				newLeafNode(otherlv_9, grammarAccess.getParamListAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:459:3: ( () otherlv_11= '(' otherlv_12= ')' )
                    {
                    // InternalTeSSLa.g:459:3: ( () otherlv_11= '(' otherlv_12= ')' )
                    // InternalTeSSLa.g:460:4: () otherlv_11= '(' otherlv_12= ')'
                    {
                    // InternalTeSSLa.g:460:4: ()
                    // InternalTeSSLa.g:461:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getParamListAccess().getParamListAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getParamListAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    otherlv_12=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getParamListAccess().getRightParenthesisKeyword_1_2());
                      			
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
    // $ANTLR end "ruleparamList"


    // $ANTLR start "entryRuleout"
    // InternalTeSSLa.g:483:1: entryRuleout returns [EObject current=null] : iv_ruleout= ruleout EOF ;
    public final EObject entryRuleout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleout = null;


        try {
            // InternalTeSSLa.g:483:44: (iv_ruleout= ruleout EOF )
            // InternalTeSSLa.g:484:2: iv_ruleout= ruleout EOF
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
    // InternalTeSSLa.g:490:1: ruleout returns [EObject current=null] : (otherlv_0= 'out' ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:496:2: ( (otherlv_0= 'out' ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // InternalTeSSLa.g:497:2: (otherlv_0= 'out' ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // InternalTeSSLa.g:497:2: (otherlv_0= 'out' ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // InternalTeSSLa.g:498:3: otherlv_0= 'out' ( (lv_expression_1_0= ruleexpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOutAccess().getOutKeyword_0());
              		
            }
            // InternalTeSSLa.g:502:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalTeSSLa.g:503:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalTeSSLa.g:503:4: (lv_expression_1_0= ruleexpression )
            // InternalTeSSLa.g:504:5: lv_expression_1_0= ruleexpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOutAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_expression_1_0=ruleexpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOutRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"de.uniluebeck.isp.tessla.TeSSLa.expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTeSSLa.g:521:3: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTeSSLa.g:522:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOutAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalTeSSLa.g:526:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalTeSSLa.g:527:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:527:5: (lv_name_3_0= RULE_ID )
                    // InternalTeSSLa.g:528:6: lv_name_3_0= RULE_ID
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
    // InternalTeSSLa.g:549:1: entryRulein returns [EObject current=null] : iv_rulein= rulein EOF ;
    public final EObject entryRulein() throws RecognitionException {
        EObject current = null;

        EObject iv_rulein = null;


        try {
            // InternalTeSSLa.g:549:43: (iv_rulein= rulein EOF )
            // InternalTeSSLa.g:550:2: iv_rulein= rulein EOF
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
    // InternalTeSSLa.g:556:1: rulein returns [EObject current=null] : (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) ) ;
    public final EObject rulein() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:562:2: ( (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) ) )
            // InternalTeSSLa.g:563:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )
            {
            // InternalTeSSLa.g:563:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )
            // InternalTeSSLa.g:564:3: otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInAccess().getInKeyword_0());
              		
            }
            // InternalTeSSLa.g:568:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTeSSLa.g:569:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTeSSLa.g:569:4: (lv_name_1_0= RULE_ID )
            // InternalTeSSLa.g:570:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
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
            // InternalTeSSLa.g:590:3: ( (lv_type_3_0= ruletype ) )
            // InternalTeSSLa.g:591:4: (lv_type_3_0= ruletype )
            {
            // InternalTeSSLa.g:591:4: (lv_type_3_0= ruletype )
            // InternalTeSSLa.g:592:5: lv_type_3_0= ruletype
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


    // $ANTLR start "entryRuleexpression"
    // InternalTeSSLa.g:613:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalTeSSLa.g:613:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalTeSSLa.g:614:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalTeSSLa.g:620:1: ruleexpression returns [EObject current=null] : ( ( (otherlv_0= 'if' ( (lv_infix_1_0= ruleexpInfix ) ) otherlv_2= 'then' )* ( (lv_infix_3_0= ruleexpInfix ) ) (otherlv_4= 'else' (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )* ( (lv_infix_8_0= ruleexpInfix ) ) )* (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? ) | (this_ID_11= RULE_ID otherlv_12= '=' this_expression_13= ruleexpression ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_ID_11=null;
        Token otherlv_12=null;
        EObject lv_infix_1_0 = null;

        EObject lv_infix_3_0 = null;

        EObject lv_infix_6_0 = null;

        EObject lv_infix_8_0 = null;

        AntlrDatatypeRuleToken lv_type_10_0 = null;

        EObject this_expression_13 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:626:2: ( ( ( (otherlv_0= 'if' ( (lv_infix_1_0= ruleexpInfix ) ) otherlv_2= 'then' )* ( (lv_infix_3_0= ruleexpInfix ) ) (otherlv_4= 'else' (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )* ( (lv_infix_8_0= ruleexpInfix ) ) )* (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? ) | (this_ID_11= RULE_ID otherlv_12= '=' this_expression_13= ruleexpression ) ) )
            // InternalTeSSLa.g:627:2: ( ( (otherlv_0= 'if' ( (lv_infix_1_0= ruleexpInfix ) ) otherlv_2= 'then' )* ( (lv_infix_3_0= ruleexpInfix ) ) (otherlv_4= 'else' (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )* ( (lv_infix_8_0= ruleexpInfix ) ) )* (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? ) | (this_ID_11= RULE_ID otherlv_12= '=' this_expression_13= ruleexpression ) )
            {
            // InternalTeSSLa.g:627:2: ( ( (otherlv_0= 'if' ( (lv_infix_1_0= ruleexpInfix ) ) otherlv_2= 'then' )* ( (lv_infix_3_0= ruleexpInfix ) ) (otherlv_4= 'else' (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )* ( (lv_infix_8_0= ruleexpInfix ) ) )* (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? ) | (this_ID_11= RULE_ID otherlv_12= '=' this_expression_13= ruleexpression ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_INT)||LA17_0==23||(LA17_0>=27 && LA17_0<=29)||LA17_0==43||(LA17_0>=46 && LA17_0<=47)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==EOF||(LA17_2>=RULE_SL_COMMENT && LA17_2<=RULE_INT)||(LA17_2>=11 && LA17_2<=13)||(LA17_2>=16 && LA17_2<=23)||LA17_2==25||(LA17_2>=27 && LA17_2<=47)) ) {
                    alt17=1;
                }
                else if ( (LA17_2==26) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTeSSLa.g:628:3: ( (otherlv_0= 'if' ( (lv_infix_1_0= ruleexpInfix ) ) otherlv_2= 'then' )* ( (lv_infix_3_0= ruleexpInfix ) ) (otherlv_4= 'else' (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )* ( (lv_infix_8_0= ruleexpInfix ) ) )* (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? )
                    {
                    // InternalTeSSLa.g:628:3: ( (otherlv_0= 'if' ( (lv_infix_1_0= ruleexpInfix ) ) otherlv_2= 'then' )* ( (lv_infix_3_0= ruleexpInfix ) ) (otherlv_4= 'else' (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )* ( (lv_infix_8_0= ruleexpInfix ) ) )* (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? )
                    // InternalTeSSLa.g:629:4: (otherlv_0= 'if' ( (lv_infix_1_0= ruleexpInfix ) ) otherlv_2= 'then' )* ( (lv_infix_3_0= ruleexpInfix ) ) (otherlv_4= 'else' (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )* ( (lv_infix_8_0= ruleexpInfix ) ) )* (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )?
                    {
                    // InternalTeSSLa.g:629:4: (otherlv_0= 'if' ( (lv_infix_1_0= ruleexpInfix ) ) otherlv_2= 'then' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalTeSSLa.g:630:5: otherlv_0= 'if' ( (lv_infix_1_0= ruleexpInfix ) ) otherlv_2= 'then'
                    	    {
                    	    otherlv_0=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getIfKeyword_0_0_0());
                    	      				
                    	    }
                    	    // InternalTeSSLa.g:634:5: ( (lv_infix_1_0= ruleexpInfix ) )
                    	    // InternalTeSSLa.g:635:6: (lv_infix_1_0= ruleexpInfix )
                    	    {
                    	    // InternalTeSSLa.g:635:6: (lv_infix_1_0= ruleexpInfix )
                    	    // InternalTeSSLa.g:636:7: lv_infix_1_0= ruleexpInfix
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExpressionAccess().getInfixExpInfixParserRuleCall_0_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_infix_1_0=ruleexpInfix();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"infix",
                    	      								lv_infix_1_0,
                    	      								"de.uniluebeck.isp.tessla.TeSSLa.expInfix");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_2=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getThenKeyword_0_0_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalTeSSLa.g:658:4: ( (lv_infix_3_0= ruleexpInfix ) )
                    // InternalTeSSLa.g:659:5: (lv_infix_3_0= ruleexpInfix )
                    {
                    // InternalTeSSLa.g:659:5: (lv_infix_3_0= ruleexpInfix )
                    // InternalTeSSLa.g:660:6: lv_infix_3_0= ruleexpInfix
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getInfixExpInfixParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_infix_3_0=ruleexpInfix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						add(
                      							current,
                      							"infix",
                      							lv_infix_3_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.expInfix");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTeSSLa.g:677:4: (otherlv_4= 'else' (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )* ( (lv_infix_8_0= ruleexpInfix ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==25) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalTeSSLa.g:678:5: otherlv_4= 'else' (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )* ( (lv_infix_8_0= ruleexpInfix ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getElseKeyword_0_2_0());
                    	      				
                    	    }
                    	    // InternalTeSSLa.g:682:5: (otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then' )*
                    	    loop14:
                    	    do {
                    	        int alt14=2;
                    	        int LA14_0 = input.LA(1);

                    	        if ( (LA14_0==23) ) {
                    	            alt14=1;
                    	        }


                    	        switch (alt14) {
                    	    	case 1 :
                    	    	    // InternalTeSSLa.g:683:6: otherlv_5= 'if' ( (lv_infix_6_0= ruleexpInfix ) ) otherlv_7= 'then'
                    	    	    {
                    	    	    otherlv_5=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getIfKeyword_0_2_1_0());
                    	    	      					
                    	    	    }
                    	    	    // InternalTeSSLa.g:687:6: ( (lv_infix_6_0= ruleexpInfix ) )
                    	    	    // InternalTeSSLa.g:688:7: (lv_infix_6_0= ruleexpInfix )
                    	    	    {
                    	    	    // InternalTeSSLa.g:688:7: (lv_infix_6_0= ruleexpInfix )
                    	    	    // InternalTeSSLa.g:689:8: lv_infix_6_0= ruleexpInfix
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {

                    	    	      								newCompositeNode(grammarAccess.getExpressionAccess().getInfixExpInfixParserRuleCall_0_2_1_1_0());
                    	    	      							
                    	    	    }
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_infix_6_0=ruleexpInfix();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      								if (current==null) {
                    	    	      									current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    	      								}
                    	    	      								add(
                    	    	      									current,
                    	    	      									"infix",
                    	    	      									lv_infix_6_0,
                    	    	      									"de.uniluebeck.isp.tessla.TeSSLa.expInfix");
                    	    	      								afterParserOrEnumRuleCall();
                    	    	      							
                    	    	    }

                    	    	    }


                    	    	    }

                    	    	    otherlv_7=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getThenKeyword_0_2_1_2());
                    	    	      					
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop14;
                    	        }
                    	    } while (true);

                    	    // InternalTeSSLa.g:711:5: ( (lv_infix_8_0= ruleexpInfix ) )
                    	    // InternalTeSSLa.g:712:6: (lv_infix_8_0= ruleexpInfix )
                    	    {
                    	    // InternalTeSSLa.g:712:6: (lv_infix_8_0= ruleexpInfix )
                    	    // InternalTeSSLa.g:713:7: lv_infix_8_0= ruleexpInfix
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExpressionAccess().getInfixExpInfixParserRuleCall_0_2_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_infix_8_0=ruleexpInfix();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"infix",
                    	      								lv_infix_8_0,
                    	      								"de.uniluebeck.isp.tessla.TeSSLa.expInfix");
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

                    // InternalTeSSLa.g:731:4: (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==13) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalTeSSLa.g:732:5: otherlv_9= ':' ( (lv_type_10_0= ruletype ) )
                            {
                            otherlv_9=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getColonKeyword_0_3_0());
                              				
                            }
                            // InternalTeSSLa.g:736:5: ( (lv_type_10_0= ruletype ) )
                            // InternalTeSSLa.g:737:6: (lv_type_10_0= ruletype )
                            {
                            // InternalTeSSLa.g:737:6: (lv_type_10_0= ruletype )
                            // InternalTeSSLa.g:738:7: lv_type_10_0= ruletype
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpressionAccess().getTypeTypeParserRuleCall_0_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_type_10_0=ruletype();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpressionRule());
                              							}
                              							set(
                              								current,
                              								"type",
                              								lv_type_10_0,
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
                    break;
                case 2 :
                    // InternalTeSSLa.g:758:3: (this_ID_11= RULE_ID otherlv_12= '=' this_expression_13= ruleexpression )
                    {
                    // InternalTeSSLa.g:758:3: (this_ID_11= RULE_ID otherlv_12= '=' this_expression_13= ruleexpression )
                    // InternalTeSSLa.g:759:4: this_ID_11= RULE_ID otherlv_12= '=' this_expression_13= ruleexpression
                    {
                    this_ID_11=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_11, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_0());
                      			
                    }
                    otherlv_12=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getExpressionAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_expression_13=ruleexpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_expression_13;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleexpInfix"
    // InternalTeSSLa.g:783:1: entryRuleexpInfix returns [EObject current=null] : iv_ruleexpInfix= ruleexpInfix EOF ;
    public final EObject entryRuleexpInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpInfix = null;


        try {
            // InternalTeSSLa.g:783:49: (iv_ruleexpInfix= ruleexpInfix EOF )
            // InternalTeSSLa.g:784:2: iv_ruleexpInfix= ruleexpInfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpInfixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpInfix=ruleexpInfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpInfix; 
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
    // $ANTLR end "entryRuleexpInfix"


    // $ANTLR start "ruleexpInfix"
    // InternalTeSSLa.g:790:1: ruleexpInfix returns [EObject current=null] : ( ( (lv_unary_0_0= ruleexpUnary ) ) ( ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) ) )* (otherlv_3= ':' ( (lv_type_4_0= ruletype ) ) )? ) ;
    public final EObject ruleexpInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_unary_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_unary_2_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:796:2: ( ( ( (lv_unary_0_0= ruleexpUnary ) ) ( ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) ) )* (otherlv_3= ':' ( (lv_type_4_0= ruletype ) ) )? ) )
            // InternalTeSSLa.g:797:2: ( ( (lv_unary_0_0= ruleexpUnary ) ) ( ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) ) )* (otherlv_3= ':' ( (lv_type_4_0= ruletype ) ) )? )
            {
            // InternalTeSSLa.g:797:2: ( ( (lv_unary_0_0= ruleexpUnary ) ) ( ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) ) )* (otherlv_3= ':' ( (lv_type_4_0= ruletype ) ) )? )
            // InternalTeSSLa.g:798:3: ( (lv_unary_0_0= ruleexpUnary ) ) ( ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) ) )* (otherlv_3= ':' ( (lv_type_4_0= ruletype ) ) )?
            {
            // InternalTeSSLa.g:798:3: ( (lv_unary_0_0= ruleexpUnary ) )
            // InternalTeSSLa.g:799:4: (lv_unary_0_0= ruleexpUnary )
            {
            // InternalTeSSLa.g:799:4: (lv_unary_0_0= ruleexpUnary )
            // InternalTeSSLa.g:800:5: lv_unary_0_0= ruleexpUnary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpInfixAccess().getUnaryExpUnaryParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_unary_0_0=ruleexpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpInfixRule());
              					}
              					add(
              						current,
              						"unary",
              						lv_unary_0_0,
              						"de.uniluebeck.isp.tessla.TeSSLa.expUnary");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTeSSLa.g:817:3: ( ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalTeSSLa.g:818:4: ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) )
            	    {
            	    // InternalTeSSLa.g:818:4: ( (lv_operator_1_0= ruleinfixOperator ) )
            	    // InternalTeSSLa.g:819:5: (lv_operator_1_0= ruleinfixOperator )
            	    {
            	    // InternalTeSSLa.g:819:5: (lv_operator_1_0= ruleinfixOperator )
            	    // InternalTeSSLa.g:820:6: lv_operator_1_0= ruleinfixOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpInfixAccess().getOperatorInfixOperatorParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_operator_1_0=ruleinfixOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpInfixRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operator",
            	      							lv_operator_1_0,
            	      							"de.uniluebeck.isp.tessla.TeSSLa.infixOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTeSSLa.g:837:4: ( (lv_unary_2_0= ruleexpUnary ) )
            	    // InternalTeSSLa.g:838:5: (lv_unary_2_0= ruleexpUnary )
            	    {
            	    // InternalTeSSLa.g:838:5: (lv_unary_2_0= ruleexpUnary )
            	    // InternalTeSSLa.g:839:6: lv_unary_2_0= ruleexpUnary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpInfixAccess().getUnaryExpUnaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_unary_2_0=ruleexpUnary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpInfixRule());
            	      						}
            	      						add(
            	      							current,
            	      							"unary",
            	      							lv_unary_2_0,
            	      							"de.uniluebeck.isp.tessla.TeSSLa.expUnary");
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

            // InternalTeSSLa.g:857:3: (otherlv_3= ':' ( (lv_type_4_0= ruletype ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_ID) ) {
                    int LA19_3 = input.LA(3);

                    if ( (synpred21_InternalTeSSLa()) ) {
                        alt19=1;
                    }
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalTeSSLa.g:858:4: otherlv_3= ':' ( (lv_type_4_0= ruletype ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExpInfixAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalTeSSLa.g:862:4: ( (lv_type_4_0= ruletype ) )
                    // InternalTeSSLa.g:863:5: (lv_type_4_0= ruletype )
                    {
                    // InternalTeSSLa.g:863:5: (lv_type_4_0= ruletype )
                    // InternalTeSSLa.g:864:6: lv_type_4_0= ruletype
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpInfixAccess().getTypeTypeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpInfixRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_4_0,
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
    // $ANTLR end "ruleexpInfix"


    // $ANTLR start "entryRuleexpUnary"
    // InternalTeSSLa.g:886:1: entryRuleexpUnary returns [EObject current=null] : iv_ruleexpUnary= ruleexpUnary EOF ;
    public final EObject entryRuleexpUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpUnary = null;


        try {
            // InternalTeSSLa.g:886:49: (iv_ruleexpUnary= ruleexpUnary EOF )
            // InternalTeSSLa.g:887:2: iv_ruleexpUnary= ruleexpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpUnaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpUnary=ruleexpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpUnary; 
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
    // $ANTLR end "entryRuleexpUnary"


    // $ANTLR start "ruleexpUnary"
    // InternalTeSSLa.g:893:1: ruleexpUnary returns [EObject current=null] : ( ( (lv_operator_0_0= ruleunaryOperator ) )? ( (lv_value_1_0= ruleexpFunc ) ) (otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )? ) ;
    public final EObject ruleexpUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:899:2: ( ( ( (lv_operator_0_0= ruleunaryOperator ) )? ( (lv_value_1_0= ruleexpFunc ) ) (otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )? ) )
            // InternalTeSSLa.g:900:2: ( ( (lv_operator_0_0= ruleunaryOperator ) )? ( (lv_value_1_0= ruleexpFunc ) ) (otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )? )
            {
            // InternalTeSSLa.g:900:2: ( ( (lv_operator_0_0= ruleunaryOperator ) )? ( (lv_value_1_0= ruleexpFunc ) ) (otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )? )
            // InternalTeSSLa.g:901:3: ( (lv_operator_0_0= ruleunaryOperator ) )? ( (lv_value_1_0= ruleexpFunc ) ) (otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )?
            {
            // InternalTeSSLa.g:901:3: ( (lv_operator_0_0= ruleunaryOperator ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43||(LA20_0>=46 && LA20_0<=47)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTeSSLa.g:902:4: (lv_operator_0_0= ruleunaryOperator )
                    {
                    // InternalTeSSLa.g:902:4: (lv_operator_0_0= ruleunaryOperator )
                    // InternalTeSSLa.g:903:5: lv_operator_0_0= ruleunaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpUnaryAccess().getOperatorUnaryOperatorParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_operator_0_0=ruleunaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpUnaryRule());
                      					}
                      					set(
                      						current,
                      						"operator",
                      						lv_operator_0_0,
                      						"de.uniluebeck.isp.tessla.TeSSLa.unaryOperator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTeSSLa.g:920:3: ( (lv_value_1_0= ruleexpFunc ) )
            // InternalTeSSLa.g:921:4: (lv_value_1_0= ruleexpFunc )
            {
            // InternalTeSSLa.g:921:4: (lv_value_1_0= ruleexpFunc )
            // InternalTeSSLa.g:922:5: lv_value_1_0= ruleexpFunc
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpUnaryAccess().getValueExpFuncParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_value_1_0=ruleexpFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpUnaryRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"de.uniluebeck.isp.tessla.TeSSLa.expFunc");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTeSSLa.g:939:3: (otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    int LA21_3 = input.LA(3);

                    if ( (synpred23_InternalTeSSLa()) ) {
                        alt21=1;
                    }
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalTeSSLa.g:940:4: otherlv_2= ':' ( (lv_type_3_0= ruletype ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExpUnaryAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalTeSSLa.g:944:4: ( (lv_type_3_0= ruletype ) )
                    // InternalTeSSLa.g:945:5: (lv_type_3_0= ruletype )
                    {
                    // InternalTeSSLa.g:945:5: (lv_type_3_0= ruletype )
                    // InternalTeSSLa.g:946:6: lv_type_3_0= ruletype
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpUnaryAccess().getTypeTypeParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpUnaryRule());
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
    // $ANTLR end "ruleexpUnary"


    // $ANTLR start "entryRuleexpFunc"
    // InternalTeSSLa.g:968:1: entryRuleexpFunc returns [EObject current=null] : iv_ruleexpFunc= ruleexpFunc EOF ;
    public final EObject entryRuleexpFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpFunc = null;


        try {
            // InternalTeSSLa.g:968:48: (iv_ruleexpFunc= ruleexpFunc EOF )
            // InternalTeSSLa.g:969:2: iv_ruleexpFunc= ruleexpFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpFuncRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpFunc=ruleexpFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpFunc; 
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
    // $ANTLR end "entryRuleexpFunc"


    // $ANTLR start "ruleexpFunc"
    // InternalTeSSLa.g:975:1: ruleexpFunc returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleexpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_type_7_0= ruletype ) ) )? ) | ( ( (lv_name_8_0= ruleexpLit ) ) (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? ) ) ;
    public final EObject ruleexpFunc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;

        AntlrDatatypeRuleToken lv_name_8_0 = null;

        AntlrDatatypeRuleToken lv_type_10_0 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:981:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleexpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_type_7_0= ruletype ) ) )? ) | ( ( (lv_name_8_0= ruleexpLit ) ) (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? ) ) )
            // InternalTeSSLa.g:982:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleexpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_type_7_0= ruletype ) ) )? ) | ( ( (lv_name_8_0= ruleexpLit ) ) (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? ) )
            {
            // InternalTeSSLa.g:982:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleexpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_type_7_0= ruletype ) ) )? ) | ( ( (lv_name_8_0= ruleexpLit ) ) (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==17) ) {
                    alt26=1;
                }
                else if ( (LA26_1==EOF||(LA26_1>=RULE_SL_COMMENT && LA26_1<=RULE_INT)||(LA26_1>=11 && LA26_1<=13)||LA26_1==16||(LA26_1>=18 && LA26_1<=25)||(LA26_1>=27 && LA26_1<=47)) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_INT)||(LA26_0>=27 && LA26_0<=29)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalTeSSLa.g:983:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleexpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_type_7_0= ruletype ) ) )? )
                    {
                    // InternalTeSSLa.g:983:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleexpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_type_7_0= ruletype ) ) )? )
                    // InternalTeSSLa.g:984:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleexpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )* )? otherlv_5= ')' (otherlv_6= ':' ( (lv_type_7_0= ruletype ) ) )?
                    {
                    // InternalTeSSLa.g:984:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalTeSSLa.g:985:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalTeSSLa.g:985:5: (lv_name_0_0= RULE_ID )
                    // InternalTeSSLa.g:986:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_0, grammarAccess.getExpFuncAccess().getNameIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpFuncRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getExpFuncAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalTeSSLa.g:1006:4: ( ( (lv_params_2_0= ruleexpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==23||(LA23_0>=27 && LA23_0<=29)||LA23_0==43||(LA23_0>=46 && LA23_0<=47)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalTeSSLa.g:1007:5: ( (lv_params_2_0= ruleexpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )*
                            {
                            // InternalTeSSLa.g:1007:5: ( (lv_params_2_0= ruleexpression ) )
                            // InternalTeSSLa.g:1008:6: (lv_params_2_0= ruleexpression )
                            {
                            // InternalTeSSLa.g:1008:6: (lv_params_2_0= ruleexpression )
                            // InternalTeSSLa.g:1009:7: lv_params_2_0= ruleexpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpFuncAccess().getParamsExpressionParserRuleCall_0_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_params_2_0=ruleexpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpFuncRule());
                              							}
                              							add(
                              								current,
                              								"params",
                              								lv_params_2_0,
                              								"de.uniluebeck.isp.tessla.TeSSLa.expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalTeSSLa.g:1026:5: (otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==18) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalTeSSLa.g:1027:6: otherlv_3= ',' ( (lv_params_4_0= ruleexpression ) )
                            	    {
                            	    otherlv_3=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_3, grammarAccess.getExpFuncAccess().getCommaKeyword_0_2_1_0());
                            	      					
                            	    }
                            	    // InternalTeSSLa.g:1031:6: ( (lv_params_4_0= ruleexpression ) )
                            	    // InternalTeSSLa.g:1032:7: (lv_params_4_0= ruleexpression )
                            	    {
                            	    // InternalTeSSLa.g:1032:7: (lv_params_4_0= ruleexpression )
                            	    // InternalTeSSLa.g:1033:8: lv_params_4_0= ruleexpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getExpFuncAccess().getParamsExpressionParserRuleCall_0_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_12);
                            	    lv_params_4_0=ruleexpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getExpFuncRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"params",
                            	      									lv_params_4_0,
                            	      									"de.uniluebeck.isp.tessla.TeSSLa.expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getExpFuncAccess().getRightParenthesisKeyword_0_3());
                      			
                    }
                    // InternalTeSSLa.g:1056:4: (otherlv_6= ':' ( (lv_type_7_0= ruletype ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==13) ) {
                        int LA24_1 = input.LA(2);

                        if ( (LA24_1==RULE_ID) ) {
                            int LA24_3 = input.LA(3);

                            if ( (synpred26_InternalTeSSLa()) ) {
                                alt24=1;
                            }
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalTeSSLa.g:1057:5: otherlv_6= ':' ( (lv_type_7_0= ruletype ) )
                            {
                            otherlv_6=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getExpFuncAccess().getColonKeyword_0_4_0());
                              				
                            }
                            // InternalTeSSLa.g:1061:5: ( (lv_type_7_0= ruletype ) )
                            // InternalTeSSLa.g:1062:6: (lv_type_7_0= ruletype )
                            {
                            // InternalTeSSLa.g:1062:6: (lv_type_7_0= ruletype )
                            // InternalTeSSLa.g:1063:7: lv_type_7_0= ruletype
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpFuncAccess().getTypeTypeParserRuleCall_0_4_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_type_7_0=ruletype();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpFuncRule());
                              							}
                              							set(
                              								current,
                              								"type",
                              								lv_type_7_0,
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
                    break;
                case 2 :
                    // InternalTeSSLa.g:1083:3: ( ( (lv_name_8_0= ruleexpLit ) ) (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? )
                    {
                    // InternalTeSSLa.g:1083:3: ( ( (lv_name_8_0= ruleexpLit ) ) (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )? )
                    // InternalTeSSLa.g:1084:4: ( (lv_name_8_0= ruleexpLit ) ) (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )?
                    {
                    // InternalTeSSLa.g:1084:4: ( (lv_name_8_0= ruleexpLit ) )
                    // InternalTeSSLa.g:1085:5: (lv_name_8_0= ruleexpLit )
                    {
                    // InternalTeSSLa.g:1085:5: (lv_name_8_0= ruleexpLit )
                    // InternalTeSSLa.g:1086:6: lv_name_8_0= ruleexpLit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpFuncAccess().getNameExpLitParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_name_8_0=ruleexpLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpFuncRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_8_0,
                      							"de.uniluebeck.isp.tessla.TeSSLa.expLit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTeSSLa.g:1103:4: (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==13) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==RULE_ID) ) {
                            int LA25_3 = input.LA(3);

                            if ( (synpred28_InternalTeSSLa()) ) {
                                alt25=1;
                            }
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalTeSSLa.g:1104:5: otherlv_9= ':' ( (lv_type_10_0= ruletype ) )
                            {
                            otherlv_9=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getExpFuncAccess().getColonKeyword_1_1_0());
                              				
                            }
                            // InternalTeSSLa.g:1108:5: ( (lv_type_10_0= ruletype ) )
                            // InternalTeSSLa.g:1109:6: (lv_type_10_0= ruletype )
                            {
                            // InternalTeSSLa.g:1109:6: (lv_type_10_0= ruletype )
                            // InternalTeSSLa.g:1110:7: lv_type_10_0= ruletype
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpFuncAccess().getTypeTypeParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_type_10_0=ruletype();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpFuncRule());
                              							}
                              							set(
                              								current,
                              								"type",
                              								lv_type_10_0,
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
    // $ANTLR end "ruleexpFunc"


    // $ANTLR start "entryRuleexpLit"
    // InternalTeSSLa.g:1133:1: entryRuleexpLit returns [String current=null] : iv_ruleexpLit= ruleexpLit EOF ;
    public final String entryRuleexpLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpLit = null;


        try {
            // InternalTeSSLa.g:1133:46: (iv_ruleexpLit= ruleexpLit EOF )
            // InternalTeSSLa.g:1134:2: iv_ruleexpLit= ruleexpLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleexpLit=ruleexpLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexpLit.getText(); 
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
    // $ANTLR end "entryRuleexpLit"


    // $ANTLR start "ruleexpLit"
    // InternalTeSSLa.g:1140:1: ruleexpLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | kw= '()' | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleexpLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalTeSSLa.g:1146:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | kw= '()' | kw= 'true' | kw= 'false' ) )
            // InternalTeSSLa.g:1147:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | kw= '()' | kw= 'true' | kw= 'false' )
            {
            // InternalTeSSLa.g:1147:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | kw= '()' | kw= 'true' | kw= 'false' )
            int alt27=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case RULE_STRING:
                {
                alt27=2;
                }
                break;
            case RULE_INT:
                {
                alt27=3;
                }
                break;
            case 27:
                {
                alt27=4;
                }
                break;
            case 28:
                {
                alt27=5;
                }
                break;
            case 29:
                {
                alt27=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalTeSSLa.g:1148:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getExpLitAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:1156:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_1, grammarAccess.getExpLitAccess().getSTRINGTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:1164:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_2, grammarAccess.getExpLitAccess().getINTTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTeSSLa.g:1172:3: kw= '()'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getExpLitAccess().getLeftParenthesisRightParenthesisKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTeSSLa.g:1178:3: kw= 'true'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getExpLitAccess().getTrueKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTeSSLa.g:1184:3: kw= 'false'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getExpLitAccess().getFalseKeyword_5());
                      		
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
    // $ANTLR end "ruleexpLit"


    // $ANTLR start "entryRuletype"
    // InternalTeSSLa.g:1193:1: entryRuletype returns [String current=null] : iv_ruletype= ruletype EOF ;
    public final String entryRuletype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletype = null;


        try {
            // InternalTeSSLa.g:1193:44: (iv_ruletype= ruletype EOF )
            // InternalTeSSLa.g:1194:2: iv_ruletype= ruletype EOF
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
    // InternalTeSSLa.g:1200:1: ruletype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruletype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_6=null;
        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_type_4 = null;



        	enterRule();

        try {
            // InternalTeSSLa.g:1206:2: ( ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID ) )
            // InternalTeSSLa.g:1207:2: ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID )
            {
            // InternalTeSSLa.g:1207:2: ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) | this_ID_6= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred35_InternalTeSSLa()) ) {
                    alt29=1;
                }
                else if ( (true) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalTeSSLa.g:1208:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
                    {
                    // InternalTeSSLa.g:1208:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
                    // InternalTeSSLa.g:1209:4: this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
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
                    pushFollow(FOLLOW_25);
                    this_type_2=ruletype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_type_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTeSSLa.g:1231:4: (kw= ',' this_type_4= ruletype )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==18) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalTeSSLa.g:1232:5: kw= ',' this_type_4= ruletype
                    	    {
                    	    kw=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getTypeAccess().getCommaKeyword_0_3_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_0_3_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop28;
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
                    // InternalTeSSLa.g:1255:3: this_ID_6= RULE_ID
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
    // InternalTeSSLa.g:1266:1: entryRuleinfixOperator returns [String current=null] : iv_ruleinfixOperator= ruleinfixOperator EOF ;
    public final String entryRuleinfixOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinfixOperator = null;


        try {
            // InternalTeSSLa.g:1266:53: (iv_ruleinfixOperator= ruleinfixOperator EOF )
            // InternalTeSSLa.g:1267:2: iv_ruleinfixOperator= ruleinfixOperator EOF
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
    // InternalTeSSLa.g:1273:1: ruleinfixOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleinfixOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTeSSLa.g:1279:2: ( (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalTeSSLa.g:1280:2: (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalTeSSLa.g:1280:2: (kw= '%' | kw= '<<' | kw= '>>' | kw= '>=' | kw= '<=' | kw= '<' | kw= '>' | kw= '!=' | kw= '==' | kw= '&' | kw= '|' | kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt30=16;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt30=1;
                }
                break;
            case 33:
                {
                alt30=2;
                }
                break;
            case 34:
                {
                alt30=3;
                }
                break;
            case 35:
                {
                alt30=4;
                }
                break;
            case 36:
                {
                alt30=5;
                }
                break;
            case 30:
                {
                alt30=6;
                }
                break;
            case 31:
                {
                alt30=7;
                }
                break;
            case 37:
                {
                alt30=8;
                }
                break;
            case 38:
                {
                alt30=9;
                }
                break;
            case 39:
                {
                alt30=10;
                }
                break;
            case 40:
                {
                alt30=11;
                }
                break;
            case 41:
                {
                alt30=12;
                }
                break;
            case 42:
                {
                alt30=13;
                }
                break;
            case 43:
                {
                alt30=14;
                }
                break;
            case 44:
                {
                alt30=15;
                }
                break;
            case 45:
                {
                alt30=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalTeSSLa.g:1281:3: kw= '%'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getPercentSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:1287:3: kw= '<<'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignLessThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:1293:3: kw= '>>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTeSSLa.g:1299:3: kw= '>='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTeSSLa.g:1305:3: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTeSSLa.g:1311:3: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalTeSSLa.g:1317:3: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getGreaterThanSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalTeSSLa.g:1323:3: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getExclamationMarkEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalTeSSLa.g:1329:3: kw= '=='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getEqualsSignEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalTeSSLa.g:1335:3: kw= '&'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAmpersandKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalTeSSLa.g:1341:3: kw= '|'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getVerticalLineKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalTeSSLa.g:1347:3: kw= '^'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getCircumflexAccentKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalTeSSLa.g:1353:3: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getPlusSignKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalTeSSLa.g:1359:3: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getHyphenMinusKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalTeSSLa.g:1365:3: kw= '*'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getAsteriskKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalTeSSLa.g:1371:3: kw= '/'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getInfixOperatorAccess().getSolidusKeyword_15());
                      		
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
    // InternalTeSSLa.g:1380:1: entryRuleunaryOperator returns [String current=null] : iv_ruleunaryOperator= ruleunaryOperator EOF ;
    public final String entryRuleunaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunaryOperator = null;


        try {
            // InternalTeSSLa.g:1380:53: (iv_ruleunaryOperator= ruleunaryOperator EOF )
            // InternalTeSSLa.g:1381:2: iv_ruleunaryOperator= ruleunaryOperator EOF
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
    // InternalTeSSLa.g:1387:1: ruleunaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '~' | kw= '-' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleunaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTeSSLa.g:1393:2: ( (kw= '~' | kw= '-' | kw= '!' ) )
            // InternalTeSSLa.g:1394:2: (kw= '~' | kw= '-' | kw= '!' )
            {
            // InternalTeSSLa.g:1394:2: (kw= '~' | kw= '-' | kw= '!' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt31=1;
                }
                break;
            case 43:
                {
                alt31=2;
                }
                break;
            case 47:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalTeSSLa.g:1395:3: kw= '~'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTeSSLa.g:1401:3: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTeSSLa.g:1407:3: kw= '!'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred20_InternalTeSSLa
    public final void synpred20_InternalTeSSLa_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_unary_2_0 = null;


        // InternalTeSSLa.g:818:4: ( ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) ) )
        // InternalTeSSLa.g:818:4: ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) )
        {
        // InternalTeSSLa.g:818:4: ( (lv_operator_1_0= ruleinfixOperator ) )
        // InternalTeSSLa.g:819:5: (lv_operator_1_0= ruleinfixOperator )
        {
        // InternalTeSSLa.g:819:5: (lv_operator_1_0= ruleinfixOperator )
        // InternalTeSSLa.g:820:6: lv_operator_1_0= ruleinfixOperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExpInfixAccess().getOperatorInfixOperatorParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_14);
        lv_operator_1_0=ruleinfixOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalTeSSLa.g:837:4: ( (lv_unary_2_0= ruleexpUnary ) )
        // InternalTeSSLa.g:838:5: (lv_unary_2_0= ruleexpUnary )
        {
        // InternalTeSSLa.g:838:5: (lv_unary_2_0= ruleexpUnary )
        // InternalTeSSLa.g:839:6: lv_unary_2_0= ruleexpUnary
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExpInfixAccess().getUnaryExpUnaryParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_unary_2_0=ruleexpUnary();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalTeSSLa

    // $ANTLR start synpred21_InternalTeSSLa
    public final void synpred21_InternalTeSSLa_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;


        // InternalTeSSLa.g:858:4: (otherlv_3= ':' ( (lv_type_4_0= ruletype ) ) )
        // InternalTeSSLa.g:858:4: otherlv_3= ':' ( (lv_type_4_0= ruletype ) )
        {
        otherlv_3=(Token)match(input,13,FOLLOW_4); if (state.failed) return ;
        // InternalTeSSLa.g:862:4: ( (lv_type_4_0= ruletype ) )
        // InternalTeSSLa.g:863:5: (lv_type_4_0= ruletype )
        {
        // InternalTeSSLa.g:863:5: (lv_type_4_0= ruletype )
        // InternalTeSSLa.g:864:6: lv_type_4_0= ruletype
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExpInfixAccess().getTypeTypeParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_type_4_0=ruletype();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalTeSSLa

    // $ANTLR start synpred23_InternalTeSSLa
    public final void synpred23_InternalTeSSLa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;


        // InternalTeSSLa.g:940:4: (otherlv_2= ':' ( (lv_type_3_0= ruletype ) ) )
        // InternalTeSSLa.g:940:4: otherlv_2= ':' ( (lv_type_3_0= ruletype ) )
        {
        otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return ;
        // InternalTeSSLa.g:944:4: ( (lv_type_3_0= ruletype ) )
        // InternalTeSSLa.g:945:5: (lv_type_3_0= ruletype )
        {
        // InternalTeSSLa.g:945:5: (lv_type_3_0= ruletype )
        // InternalTeSSLa.g:946:6: lv_type_3_0= ruletype
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExpUnaryAccess().getTypeTypeParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_type_3_0=ruletype();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalTeSSLa

    // $ANTLR start synpred26_InternalTeSSLa
    public final void synpred26_InternalTeSSLa_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_type_7_0 = null;


        // InternalTeSSLa.g:1057:5: (otherlv_6= ':' ( (lv_type_7_0= ruletype ) ) )
        // InternalTeSSLa.g:1057:5: otherlv_6= ':' ( (lv_type_7_0= ruletype ) )
        {
        otherlv_6=(Token)match(input,13,FOLLOW_4); if (state.failed) return ;
        // InternalTeSSLa.g:1061:5: ( (lv_type_7_0= ruletype ) )
        // InternalTeSSLa.g:1062:6: (lv_type_7_0= ruletype )
        {
        // InternalTeSSLa.g:1062:6: (lv_type_7_0= ruletype )
        // InternalTeSSLa.g:1063:7: lv_type_7_0= ruletype
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpFuncAccess().getTypeTypeParserRuleCall_0_4_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_type_7_0=ruletype();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalTeSSLa

    // $ANTLR start synpred28_InternalTeSSLa
    public final void synpred28_InternalTeSSLa_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_type_10_0 = null;


        // InternalTeSSLa.g:1104:5: (otherlv_9= ':' ( (lv_type_10_0= ruletype ) ) )
        // InternalTeSSLa.g:1104:5: otherlv_9= ':' ( (lv_type_10_0= ruletype ) )
        {
        otherlv_9=(Token)match(input,13,FOLLOW_4); if (state.failed) return ;
        // InternalTeSSLa.g:1108:5: ( (lv_type_10_0= ruletype ) )
        // InternalTeSSLa.g:1109:6: (lv_type_10_0= ruletype )
        {
        // InternalTeSSLa.g:1109:6: (lv_type_10_0= ruletype )
        // InternalTeSSLa.g:1110:7: lv_type_10_0= ruletype
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpFuncAccess().getTypeTypeParserRuleCall_1_1_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_type_10_0=ruletype();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalTeSSLa

    // $ANTLR start synpred35_InternalTeSSLa
    public final void synpred35_InternalTeSSLa_fragment() throws RecognitionException {   
        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_type_2 = null;

        AntlrDatatypeRuleToken this_type_4 = null;


        // InternalTeSSLa.g:1208:3: ( (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' ) )
        // InternalTeSSLa.g:1208:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
        {
        // InternalTeSSLa.g:1208:3: (this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>' )
        // InternalTeSSLa.g:1209:4: this_ID_0= RULE_ID kw= '<' this_type_2= ruletype (kw= ',' this_type_4= ruletype )* kw= '>'
        {
        this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return ;
        kw=(Token)match(input,30,FOLLOW_4); if (state.failed) return ;
        pushFollow(FOLLOW_25);
        this_type_2=ruletype();

        state._fsp--;
        if (state.failed) return ;
        // InternalTeSSLa.g:1231:4: (kw= ',' this_type_4= ruletype )*
        loop45:
        do {
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==18) ) {
                alt45=1;
            }


            switch (alt45) {
        	case 1 :
        	    // InternalTeSSLa.g:1232:5: kw= ',' this_type_4= ruletype
        	    {
        	    kw=(Token)match(input,18,FOLLOW_4); if (state.failed) return ;
        	    pushFollow(FOLLOW_25);
        	    this_type_4=ruletype();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop45;
            }
        } while (true);

        kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred35_InternalTeSSLa

    // Delegated rules

    public final boolean synpred28_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalTeSSLa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalTeSSLa_fragment(); // can never throw exception
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
    public final boolean synpred20_InternalTeSSLa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalTeSSLa_fragment(); // can never throw exception
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


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\5\1\uffff\6\0";
    static final String dfa_4s = "\1\57\1\uffff\1\57\1\uffff\6\0";
    static final String dfa_5s = "\1\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String dfa_6s = "\4\uffff\1\3\1\0\1\1\1\2\1\4\1\5}>";
    static final String[] dfa_7s = {
            "\4\1\3\uffff\3\1\2\uffff\1\1\1\uffff\10\1\1\uffff\3\1\15\3\1\2\2\3\2\1",
            "",
            "\1\4\1\5\1\6\23\uffff\1\7\1\10\1\11\15\uffff\1\3\2\uffff\2\3",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 817:3: ( ( (lv_operator_1_0= ruleinfixOperator ) ) ( (lv_unary_2_0= ruleexpUnary ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalTeSSLa()) ) {s = 3;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalTeSSLa()) ) {s = 3;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalTeSSLa()) ) {s = 3;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalTeSSLa()) ) {s = 3;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalTeSSLa()) ) {s = 3;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalTeSSLa()) ) {s = 3;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_9);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000501812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000C800388080E0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000C80038D018F0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000C800388000E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002002002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00003FFFC0002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000C800388800E0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080040000L});

}
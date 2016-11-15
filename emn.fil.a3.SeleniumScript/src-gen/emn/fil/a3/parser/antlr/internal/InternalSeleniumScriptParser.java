package emn.fil.a3.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import emn.fil.a3.services.SeleniumScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_END_OF_LINE", "RULE_WS", "RULE_WHITE_SPACE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'open'", "'go'", "'click'", "'fill'", "'('", "')'", "'field'", "'button'", "'checkbox'", "'link'", "'select'", "'id'", "'class'", "'name'", "'value'", "'.'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_END_OF_LINE=4;
    public static final int RULE_ID=8;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_WHITE_SPACE=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSeleniumScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSeleniumScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSeleniumScriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSeleniumScript.g"; }



     	private SeleniumScriptGrammarAccess grammarAccess;

        public InternalSeleniumScriptParser(TokenStream input, SeleniumScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Script";
       	}

       	@Override
       	protected SeleniumScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScript"
    // InternalSeleniumScript.g:64:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalSeleniumScript.g:64:47: (iv_ruleScript= ruleScript EOF )
            // InternalSeleniumScript.g:65:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalSeleniumScript.g:71:1: ruleScript returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunction ) ) (this_END_OF_LINE_1= RULE_END_OF_LINE ( (lv_functions_2_0= ruleFunction ) ) )* (this_WS_3= RULE_WS )* ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token this_END_OF_LINE_1=null;
        Token this_WS_3=null;
        EObject lv_functions_0_0 = null;

        EObject lv_functions_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:77:2: ( ( ( (lv_functions_0_0= ruleFunction ) ) (this_END_OF_LINE_1= RULE_END_OF_LINE ( (lv_functions_2_0= ruleFunction ) ) )* (this_WS_3= RULE_WS )* ) )
            // InternalSeleniumScript.g:78:2: ( ( (lv_functions_0_0= ruleFunction ) ) (this_END_OF_LINE_1= RULE_END_OF_LINE ( (lv_functions_2_0= ruleFunction ) ) )* (this_WS_3= RULE_WS )* )
            {
            // InternalSeleniumScript.g:78:2: ( ( (lv_functions_0_0= ruleFunction ) ) (this_END_OF_LINE_1= RULE_END_OF_LINE ( (lv_functions_2_0= ruleFunction ) ) )* (this_WS_3= RULE_WS )* )
            // InternalSeleniumScript.g:79:3: ( (lv_functions_0_0= ruleFunction ) ) (this_END_OF_LINE_1= RULE_END_OF_LINE ( (lv_functions_2_0= ruleFunction ) ) )* (this_WS_3= RULE_WS )*
            {
            // InternalSeleniumScript.g:79:3: ( (lv_functions_0_0= ruleFunction ) )
            // InternalSeleniumScript.g:80:4: (lv_functions_0_0= ruleFunction )
            {
            // InternalSeleniumScript.g:80:4: (lv_functions_0_0= ruleFunction )
            // InternalSeleniumScript.g:81:5: lv_functions_0_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getScriptAccess().getFunctionsFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_functions_0_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScriptRule());
            					}
            					add(
            						current,
            						"functions",
            						lv_functions_0_0,
            						"emn.fil.a3.SeleniumScript.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumScript.g:98:3: (this_END_OF_LINE_1= RULE_END_OF_LINE ( (lv_functions_2_0= ruleFunction ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_END_OF_LINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeleniumScript.g:99:4: this_END_OF_LINE_1= RULE_END_OF_LINE ( (lv_functions_2_0= ruleFunction ) )
            	    {
            	    this_END_OF_LINE_1=(Token)match(input,RULE_END_OF_LINE,FOLLOW_4); 

            	    				newLeafNode(this_END_OF_LINE_1, grammarAccess.getScriptAccess().getEND_OF_LINETerminalRuleCall_1_0());
            	    			
            	    // InternalSeleniumScript.g:103:4: ( (lv_functions_2_0= ruleFunction ) )
            	    // InternalSeleniumScript.g:104:5: (lv_functions_2_0= ruleFunction )
            	    {
            	    // InternalSeleniumScript.g:104:5: (lv_functions_2_0= ruleFunction )
            	    // InternalSeleniumScript.g:105:6: lv_functions_2_0= ruleFunction
            	    {

            	    						newCompositeNode(grammarAccess.getScriptAccess().getFunctionsFunctionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_functions_2_0=ruleFunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScriptRule());
            	    						}
            	    						add(
            	    							current,
            	    							"functions",
            	    							lv_functions_2_0,
            	    							"emn.fil.a3.SeleniumScript.Function");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSeleniumScript.g:123:3: (this_WS_3= RULE_WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSeleniumScript.g:124:4: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_5); 

            	    				newLeafNode(this_WS_3, grammarAccess.getScriptAccess().getWSTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleFunction"
    // InternalSeleniumScript.g:133:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalSeleniumScript.g:133:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalSeleniumScript.g:134:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalSeleniumScript.g:140:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:146:2: ( ( ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) ) ) )
            // InternalSeleniumScript.g:147:2: ( ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) ) )
            {
            // InternalSeleniumScript.g:147:2: ( ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) ) )
            // InternalSeleniumScript.g:148:3: ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) )
            {
            // InternalSeleniumScript.g:148:3: ( (lv_name_0_0= ruleFun ) )
            // InternalSeleniumScript.g:149:4: (lv_name_0_0= ruleFun )
            {
            // InternalSeleniumScript.g:149:4: (lv_name_0_0= ruleFun )
            // InternalSeleniumScript.g:150:5: lv_name_0_0= ruleFun
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getNameFunParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleFun();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"emn.fil.a3.SeleniumScript.Fun");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumScript.g:167:3: ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) )
            // InternalSeleniumScript.g:168:4: ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) )
            {

            				newCompositeNode(grammarAccess.getFunctionAccess().getSEPARATORParserRuleCall_1_0());
            			
            pushFollow(FOLLOW_7);
            ruleSEPARATOR();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			
            // InternalSeleniumScript.g:175:4: ( (lv_params_2_0= ruleExpression ) )
            // InternalSeleniumScript.g:176:5: (lv_params_2_0= ruleExpression )
            {
            // InternalSeleniumScript.g:176:5: (lv_params_2_0= ruleExpression )
            // InternalSeleniumScript.g:177:6: lv_params_2_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_params_2_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFunctionRule());
            						}
            						add(
            							current,
            							"params",
            							lv_params_2_0,
            							"emn.fil.a3.SeleniumScript.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFun"
    // InternalSeleniumScript.g:199:1: entryRuleFun returns [String current=null] : iv_ruleFun= ruleFun EOF ;
    public final String entryRuleFun() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFun = null;


        try {
            // InternalSeleniumScript.g:199:43: (iv_ruleFun= ruleFun EOF )
            // InternalSeleniumScript.g:200:2: iv_ruleFun= ruleFun EOF
            {
             newCompositeNode(grammarAccess.getFunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFun=ruleFun();

            state._fsp--;

             current =iv_ruleFun.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // InternalSeleniumScript.g:206:1: ruleFun returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'open' | kw= 'go' | kw= 'click' | kw= 'fill' ) ;
    public final AntlrDatatypeRuleToken ruleFun() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:212:2: ( (kw= 'open' | kw= 'go' | kw= 'click' | kw= 'fill' ) )
            // InternalSeleniumScript.g:213:2: (kw= 'open' | kw= 'go' | kw= 'click' | kw= 'fill' )
            {
            // InternalSeleniumScript.g:213:2: (kw= 'open' | kw= 'go' | kw= 'click' | kw= 'fill' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSeleniumScript.g:214:3: kw= 'open'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunAccess().getOpenKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:220:3: kw= 'go'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunAccess().getGoKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:226:3: kw= 'click'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunAccess().getClickKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:232:3: kw= 'fill'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunAccess().getFillKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleExpression"
    // InternalSeleniumScript.g:241:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSeleniumScript.g:241:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSeleniumScript.g:242:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSeleniumScript.g:248:1: ruleExpression returns [EObject current=null] : (this_Selectors_0= ruleSelectors | rulePRIMARY ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Selectors_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:254:2: ( (this_Selectors_0= ruleSelectors | rulePRIMARY ) )
            // InternalSeleniumScript.g:255:2: (this_Selectors_0= ruleSelectors | rulePRIMARY )
            {
            // InternalSeleniumScript.g:255:2: (this_Selectors_0= ruleSelectors | rulePRIMARY )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_INT)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSeleniumScript.g:256:3: this_Selectors_0= ruleSelectors
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSelectorsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selectors_0=ruleSelectors();

                    state._fsp--;


                    			current = this_Selectors_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:265:3: rulePRIMARY
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPRIMARYParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    rulePRIMARY();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSelectors"
    // InternalSeleniumScript.g:276:1: entryRuleSelectors returns [EObject current=null] : iv_ruleSelectors= ruleSelectors EOF ;
    public final EObject entryRuleSelectors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectors = null;


        try {
            // InternalSeleniumScript.g:276:50: (iv_ruleSelectors= ruleSelectors EOF )
            // InternalSeleniumScript.g:277:2: iv_ruleSelectors= ruleSelectors EOF
            {
             newCompositeNode(grammarAccess.getSelectorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectors=ruleSelectors();

            state._fsp--;

             current =iv_ruleSelectors; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectors"


    // $ANTLR start "ruleSelectors"
    // InternalSeleniumScript.g:283:1: ruleSelectors returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')' ) ;
    public final EObject ruleSelectors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_selectors_2_0 = null;

        EObject lv_selectors_5_0 = null;

        EObject lv_selectors_6_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:289:2: ( (otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')' ) )
            // InternalSeleniumScript.g:290:2: (otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')' )
            {
            // InternalSeleniumScript.g:290:2: (otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')' )
            // InternalSeleniumScript.g:291:3: otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorsAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSeleniumScript.g:295:3: ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=19 && LA6_0<=23)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSeleniumScript.g:296:4: (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* )
                    {
                    // InternalSeleniumScript.g:296:4: (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* )
                    // InternalSeleniumScript.g:297:5: otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )*
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getSelectorsAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalSeleniumScript.g:301:5: ( (lv_selectors_2_0= ruleSelector ) )
                    // InternalSeleniumScript.g:302:6: (lv_selectors_2_0= ruleSelector )
                    {
                    // InternalSeleniumScript.g:302:6: (lv_selectors_2_0= ruleSelector )
                    // InternalSeleniumScript.g:303:7: lv_selectors_2_0= ruleSelector
                    {

                    							newCompositeNode(grammarAccess.getSelectorsAccess().getSelectorsSelectorParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_selectors_2_0=ruleSelector();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSelectorsRule());
                    							}
                    							add(
                    								current,
                    								"selectors",
                    								lv_selectors_2_0,
                    								"emn.fil.a3.SeleniumScript.Selector");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_10); 

                    					newLeafNode(otherlv_3, grammarAccess.getSelectorsAccess().getRightParenthesisKeyword_1_0_2());
                    				
                    // InternalSeleniumScript.g:324:5: ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==28) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSeleniumScript.g:325:6: ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) )
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelectorsAccess().getSELECTOR_COMBINATORParserRuleCall_1_0_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    ruleSELECTOR_COMBINATOR();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					
                    	    // InternalSeleniumScript.g:332:6: ( (lv_selectors_5_0= ruleSelector ) )
                    	    // InternalSeleniumScript.g:333:7: (lv_selectors_5_0= ruleSelector )
                    	    {
                    	    // InternalSeleniumScript.g:333:7: (lv_selectors_5_0= ruleSelector )
                    	    // InternalSeleniumScript.g:334:8: lv_selectors_5_0= ruleSelector
                    	    {

                    	    								newCompositeNode(grammarAccess.getSelectorsAccess().getSelectorsSelectorParserRuleCall_1_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
                    	    lv_selectors_5_0=ruleSelector();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSelectorsRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"selectors",
                    	    									lv_selectors_5_0,
                    	    									"emn.fil.a3.SeleniumScript.Selector");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:354:4: ( (lv_selectors_6_0= ruleSelector ) )
                    {
                    // InternalSeleniumScript.g:354:4: ( (lv_selectors_6_0= ruleSelector ) )
                    // InternalSeleniumScript.g:355:5: (lv_selectors_6_0= ruleSelector )
                    {
                    // InternalSeleniumScript.g:355:5: (lv_selectors_6_0= ruleSelector )
                    // InternalSeleniumScript.g:356:6: lv_selectors_6_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getSelectorsAccess().getSelectorsSelectorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_selectors_6_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorsRule());
                    						}
                    						add(
                    							current,
                    							"selectors",
                    							lv_selectors_6_0,
                    							"emn.fil.a3.SeleniumScript.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSelectorsAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectors"


    // $ANTLR start "entryRuleSelector"
    // InternalSeleniumScript.g:382:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalSeleniumScript.g:382:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalSeleniumScript.g:383:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalSeleniumScript.g:389:1: ruleSelector returns [EObject current=null] : ( ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_selectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token this_WHITE_SPACE_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_selectors_2_0 = null;

        EObject lv_propSelectors_4_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:395:2: ( ( ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_selectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )? ) )
            // InternalSeleniumScript.g:396:2: ( ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_selectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )? )
            {
            // InternalSeleniumScript.g:396:2: ( ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_selectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )? )
            // InternalSeleniumScript.g:397:3: ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_selectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )?
            {
            // InternalSeleniumScript.g:397:3: ( (lv_name_0_0= ruleElem ) )
            // InternalSeleniumScript.g:398:4: (lv_name_0_0= ruleElem )
            {
            // InternalSeleniumScript.g:398:4: (lv_name_0_0= ruleElem )
            // InternalSeleniumScript.g:399:5: lv_name_0_0= ruleElem
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getNameElemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleElem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"emn.fil.a3.SeleniumScript.Elem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumScript.g:416:3: (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_selectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_WHITE_SPACE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumScript.g:417:4: this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_selectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* )
                    {
                    this_WHITE_SPACE_1=(Token)match(input,RULE_WHITE_SPACE,FOLLOW_12); 

                    				newLeafNode(this_WHITE_SPACE_1, grammarAccess.getSelectorAccess().getWHITE_SPACETerminalRuleCall_1_0());
                    			
                    // InternalSeleniumScript.g:421:4: ( ( (lv_selectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* )
                    // InternalSeleniumScript.g:422:5: ( (lv_selectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )*
                    {
                    // InternalSeleniumScript.g:422:5: ( (lv_selectors_2_0= rulePropSelector ) )
                    // InternalSeleniumScript.g:423:6: (lv_selectors_2_0= rulePropSelector )
                    {
                    // InternalSeleniumScript.g:423:6: (lv_selectors_2_0= rulePropSelector )
                    // InternalSeleniumScript.g:424:7: lv_selectors_2_0= rulePropSelector
                    {

                    							newCompositeNode(grammarAccess.getSelectorAccess().getSelectorsPropSelectorParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_11);
                    lv_selectors_2_0=rulePropSelector();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSelectorRule());
                    							}
                    							add(
                    								current,
                    								"selectors",
                    								lv_selectors_2_0,
                    								"emn.fil.a3.SeleniumScript.PropSelector");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSeleniumScript.g:441:5: ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_WHITE_SPACE) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSeleniumScript.g:442:6: rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) )
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelectorAccess().getPROP_SELECTOR_COMBINATORParserRuleCall_1_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    rulePROP_SELECTOR_COMBINATOR();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					
                    	    // InternalSeleniumScript.g:449:6: ( (lv_propSelectors_4_0= rulePropSelector ) )
                    	    // InternalSeleniumScript.g:450:7: (lv_propSelectors_4_0= rulePropSelector )
                    	    {
                    	    // InternalSeleniumScript.g:450:7: (lv_propSelectors_4_0= rulePropSelector )
                    	    // InternalSeleniumScript.g:451:8: lv_propSelectors_4_0= rulePropSelector
                    	    {

                    	    								newCompositeNode(grammarAccess.getSelectorAccess().getPropSelectorsPropSelectorParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_11);
                    	    lv_propSelectors_4_0=rulePropSelector();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSelectorRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"propSelectors",
                    	    									lv_propSelectors_4_0,
                    	    									"emn.fil.a3.SeleniumScript.PropSelector");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleElem"
    // InternalSeleniumScript.g:475:1: entryRuleElem returns [String current=null] : iv_ruleElem= ruleElem EOF ;
    public final String entryRuleElem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElem = null;


        try {
            // InternalSeleniumScript.g:475:44: (iv_ruleElem= ruleElem EOF )
            // InternalSeleniumScript.g:476:2: iv_ruleElem= ruleElem EOF
            {
             newCompositeNode(grammarAccess.getElemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElem=ruleElem();

            state._fsp--;

             current =iv_ruleElem.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElem"


    // $ANTLR start "ruleElem"
    // InternalSeleniumScript.g:482:1: ruleElem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'field' | kw= 'button' | kw= 'checkbox' | kw= 'link' | kw= 'select' ) ;
    public final AntlrDatatypeRuleToken ruleElem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:488:2: ( (kw= 'field' | kw= 'button' | kw= 'checkbox' | kw= 'link' | kw= 'select' ) )
            // InternalSeleniumScript.g:489:2: (kw= 'field' | kw= 'button' | kw= 'checkbox' | kw= 'link' | kw= 'select' )
            {
            // InternalSeleniumScript.g:489:2: (kw= 'field' | kw= 'button' | kw= 'checkbox' | kw= 'link' | kw= 'select' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSeleniumScript.g:490:3: kw= 'field'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElemAccess().getFieldKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:496:3: kw= 'button'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElemAccess().getButtonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:502:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElemAccess().getCheckboxKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:508:3: kw= 'link'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElemAccess().getLinkKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleniumScript.g:514:3: kw= 'select'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElemAccess().getSelectKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElem"


    // $ANTLR start "entryRulePropSelector"
    // InternalSeleniumScript.g:523:1: entryRulePropSelector returns [EObject current=null] : iv_rulePropSelector= rulePropSelector EOF ;
    public final EObject entryRulePropSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropSelector = null;


        try {
            // InternalSeleniumScript.g:523:53: (iv_rulePropSelector= rulePropSelector EOF )
            // InternalSeleniumScript.g:524:2: iv_rulePropSelector= rulePropSelector EOF
            {
             newCompositeNode(grammarAccess.getPropSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropSelector=rulePropSelector();

            state._fsp--;

             current =iv_rulePropSelector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropSelector"


    // $ANTLR start "rulePropSelector"
    // InternalSeleniumScript.g:530:1: rulePropSelector returns [EObject current=null] : ( ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePRIMARY ) ) ) ;
    public final EObject rulePropSelector() throws RecognitionException {
        EObject current = null;

        Token this_WHITE_SPACE_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:536:2: ( ( ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePRIMARY ) ) ) )
            // InternalSeleniumScript.g:537:2: ( ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePRIMARY ) ) )
            {
            // InternalSeleniumScript.g:537:2: ( ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePRIMARY ) ) )
            // InternalSeleniumScript.g:538:3: ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePRIMARY ) )
            {
            // InternalSeleniumScript.g:538:3: ( (lv_name_0_0= ruleProp ) )
            // InternalSeleniumScript.g:539:4: (lv_name_0_0= ruleProp )
            {
            // InternalSeleniumScript.g:539:4: (lv_name_0_0= ruleProp )
            // InternalSeleniumScript.g:540:5: lv_name_0_0= ruleProp
            {

            					newCompositeNode(grammarAccess.getPropSelectorAccess().getNamePropParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleProp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropSelectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"emn.fil.a3.SeleniumScript.Prop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_WHITE_SPACE_1=(Token)match(input,RULE_WHITE_SPACE,FOLLOW_7); 

            			newLeafNode(this_WHITE_SPACE_1, grammarAccess.getPropSelectorAccess().getWHITE_SPACETerminalRuleCall_1());
            		
            // InternalSeleniumScript.g:561:3: ( (lv_param_2_0= rulePRIMARY ) )
            // InternalSeleniumScript.g:562:4: (lv_param_2_0= rulePRIMARY )
            {
            // InternalSeleniumScript.g:562:4: (lv_param_2_0= rulePRIMARY )
            // InternalSeleniumScript.g:563:5: lv_param_2_0= rulePRIMARY
            {

            					newCompositeNode(grammarAccess.getPropSelectorAccess().getParamPRIMARYParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_param_2_0=rulePRIMARY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropSelectorRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"emn.fil.a3.SeleniumScript.PRIMARY");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropSelector"


    // $ANTLR start "entryRuleProp"
    // InternalSeleniumScript.g:584:1: entryRuleProp returns [String current=null] : iv_ruleProp= ruleProp EOF ;
    public final String entryRuleProp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProp = null;


        try {
            // InternalSeleniumScript.g:584:44: (iv_ruleProp= ruleProp EOF )
            // InternalSeleniumScript.g:585:2: iv_ruleProp= ruleProp EOF
            {
             newCompositeNode(grammarAccess.getPropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProp=ruleProp();

            state._fsp--;

             current =iv_ruleProp.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProp"


    // $ANTLR start "ruleProp"
    // InternalSeleniumScript.g:591:1: ruleProp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'id' | kw= 'class' | kw= 'name' | kw= 'value' ) ;
    public final AntlrDatatypeRuleToken ruleProp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:597:2: ( (kw= 'id' | kw= 'class' | kw= 'name' | kw= 'value' ) )
            // InternalSeleniumScript.g:598:2: (kw= 'id' | kw= 'class' | kw= 'name' | kw= 'value' )
            {
            // InternalSeleniumScript.g:598:2: (kw= 'id' | kw= 'class' | kw= 'name' | kw= 'value' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSeleniumScript.g:599:3: kw= 'id'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropAccess().getIdKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:605:3: kw= 'class'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:611:3: kw= 'name'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropAccess().getNameKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:617:3: kw= 'value'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropAccess().getValueKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProp"


    // $ANTLR start "entryRulePRIMARY"
    // InternalSeleniumScript.g:626:1: entryRulePRIMARY returns [String current=null] : iv_rulePRIMARY= rulePRIMARY EOF ;
    public final String entryRulePRIMARY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePRIMARY = null;


        try {
            // InternalSeleniumScript.g:626:47: (iv_rulePRIMARY= rulePRIMARY EOF )
            // InternalSeleniumScript.g:627:2: iv_rulePRIMARY= rulePRIMARY EOF
            {
             newCompositeNode(grammarAccess.getPRIMARYRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePRIMARY=rulePRIMARY();

            state._fsp--;

             current =iv_rulePRIMARY.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePRIMARY"


    // $ANTLR start "rulePRIMARY"
    // InternalSeleniumScript.g:633:1: rulePRIMARY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePRIMARY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:639:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) )
            // InternalSeleniumScript.g:640:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            {
            // InternalSeleniumScript.g:640:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSeleniumScript.g:641:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getPRIMARYAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:649:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getPRIMARYAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:657:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getPRIMARYAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePRIMARY"


    // $ANTLR start "entryRuleSEPARATOR"
    // InternalSeleniumScript.g:668:1: entryRuleSEPARATOR returns [String current=null] : iv_ruleSEPARATOR= ruleSEPARATOR EOF ;
    public final String entryRuleSEPARATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEPARATOR = null;


        try {
            // InternalSeleniumScript.g:668:49: (iv_ruleSEPARATOR= ruleSEPARATOR EOF )
            // InternalSeleniumScript.g:669:2: iv_ruleSEPARATOR= ruleSEPARATOR EOF
            {
             newCompositeNode(grammarAccess.getSEPARATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSEPARATOR=ruleSEPARATOR();

            state._fsp--;

             current =iv_ruleSEPARATOR.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSEPARATOR"


    // $ANTLR start "ruleSEPARATOR"
    // InternalSeleniumScript.g:675:1: ruleSEPARATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_WHITE_SPACE_0= RULE_WHITE_SPACE ;
    public final AntlrDatatypeRuleToken ruleSEPARATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WHITE_SPACE_0=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:681:2: (this_WHITE_SPACE_0= RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:682:2: this_WHITE_SPACE_0= RULE_WHITE_SPACE
            {
            this_WHITE_SPACE_0=(Token)match(input,RULE_WHITE_SPACE,FOLLOW_2); 

            		current.merge(this_WHITE_SPACE_0);
            	

            		newLeafNode(this_WHITE_SPACE_0, grammarAccess.getSEPARATORAccess().getWHITE_SPACETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSEPARATOR"


    // $ANTLR start "entryRuleSELECTOR_COMBINATOR"
    // InternalSeleniumScript.g:692:1: entryRuleSELECTOR_COMBINATOR returns [String current=null] : iv_ruleSELECTOR_COMBINATOR= ruleSELECTOR_COMBINATOR EOF ;
    public final String entryRuleSELECTOR_COMBINATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSELECTOR_COMBINATOR = null;


        try {
            // InternalSeleniumScript.g:692:59: (iv_ruleSELECTOR_COMBINATOR= ruleSELECTOR_COMBINATOR EOF )
            // InternalSeleniumScript.g:693:2: iv_ruleSELECTOR_COMBINATOR= ruleSELECTOR_COMBINATOR EOF
            {
             newCompositeNode(grammarAccess.getSELECTOR_COMBINATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSELECTOR_COMBINATOR=ruleSELECTOR_COMBINATOR();

            state._fsp--;

             current =iv_ruleSELECTOR_COMBINATOR.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSELECTOR_COMBINATOR"


    // $ANTLR start "ruleSELECTOR_COMBINATOR"
    // InternalSeleniumScript.g:699:1: ruleSELECTOR_COMBINATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruleSELECTOR_COMBINATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:705:2: (kw= '.' )
            // InternalSeleniumScript.g:706:2: kw= '.'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSELECTOR_COMBINATORAccess().getFullStopKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSELECTOR_COMBINATOR"


    // $ANTLR start "entryRulePROP_SELECTOR_COMBINATOR"
    // InternalSeleniumScript.g:714:1: entryRulePROP_SELECTOR_COMBINATOR returns [String current=null] : iv_rulePROP_SELECTOR_COMBINATOR= rulePROP_SELECTOR_COMBINATOR EOF ;
    public final String entryRulePROP_SELECTOR_COMBINATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePROP_SELECTOR_COMBINATOR = null;


        try {
            // InternalSeleniumScript.g:714:64: (iv_rulePROP_SELECTOR_COMBINATOR= rulePROP_SELECTOR_COMBINATOR EOF )
            // InternalSeleniumScript.g:715:2: iv_rulePROP_SELECTOR_COMBINATOR= rulePROP_SELECTOR_COMBINATOR EOF
            {
             newCompositeNode(grammarAccess.getPROP_SELECTOR_COMBINATORRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePROP_SELECTOR_COMBINATOR=rulePROP_SELECTOR_COMBINATOR();

            state._fsp--;

             current =iv_rulePROP_SELECTOR_COMBINATOR.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePROP_SELECTOR_COMBINATOR"


    // $ANTLR start "rulePROP_SELECTOR_COMBINATOR"
    // InternalSeleniumScript.g:721:1: rulePROP_SELECTOR_COMBINATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_WHITE_SPACE_0= RULE_WHITE_SPACE ;
    public final AntlrDatatypeRuleToken rulePROP_SELECTOR_COMBINATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WHITE_SPACE_0=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:727:2: (this_WHITE_SPACE_0= RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:728:2: this_WHITE_SPACE_0= RULE_WHITE_SPACE
            {
            this_WHITE_SPACE_0=(Token)match(input,RULE_WHITE_SPACE,FOLLOW_2); 

            		current.merge(this_WHITE_SPACE_0);
            	

            		newLeafNode(this_WHITE_SPACE_0, grammarAccess.getPROP_SELECTOR_COMBINATORAccess().getWHITE_SPACETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePROP_SELECTOR_COMBINATOR"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020380L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000FA0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000F000000L});

}
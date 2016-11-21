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
    // InternalSeleniumScript.g:140:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:146:2: ( ( ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) )* ) )
            // InternalSeleniumScript.g:147:2: ( ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) )* )
            {
            // InternalSeleniumScript.g:147:2: ( ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) )* )
            // InternalSeleniumScript.g:148:3: ( (lv_name_0_0= ruleFun ) ) ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) )*
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

            // InternalSeleniumScript.g:167:3: ( ruleSEPARATOR ( (lv_params_2_0= ruleExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_WHITE_SPACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
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
            	    					
            	    pushFollow(FOLLOW_6);
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
            	    break;

            	default :
            	    break loop3;
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
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
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
    // InternalSeleniumScript.g:248:1: ruleExpression returns [EObject current=null] : (this_Selectors_0= ruleSelectors | this_Primary_1= rulePrimary ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Selectors_0 = null;

        EObject this_Primary_1 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:254:2: ( (this_Selectors_0= ruleSelectors | this_Primary_1= rulePrimary ) )
            // InternalSeleniumScript.g:255:2: (this_Selectors_0= ruleSelectors | this_Primary_1= rulePrimary )
            {
            // InternalSeleniumScript.g:255:2: (this_Selectors_0= ruleSelectors | this_Primary_1= rulePrimary )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_INT)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
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
                    // InternalSeleniumScript.g:265:3: this_Primary_1= rulePrimary
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPrimaryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primary_1=rulePrimary();

                    state._fsp--;


                    			current = this_Primary_1;
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
    // InternalSeleniumScript.g:277:1: entryRuleSelectors returns [EObject current=null] : iv_ruleSelectors= ruleSelectors EOF ;
    public final EObject entryRuleSelectors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectors = null;


        try {
            // InternalSeleniumScript.g:277:50: (iv_ruleSelectors= ruleSelectors EOF )
            // InternalSeleniumScript.g:278:2: iv_ruleSelectors= ruleSelectors EOF
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
    // InternalSeleniumScript.g:284:1: ruleSelectors returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')' ) ;
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
            // InternalSeleniumScript.g:290:2: ( (otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')' ) )
            // InternalSeleniumScript.g:291:2: (otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')' )
            {
            // InternalSeleniumScript.g:291:2: (otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')' )
            // InternalSeleniumScript.g:292:3: otherlv_0= '(' ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorsAccess().getLeftParenthesisKeyword_0());
            		
            // InternalSeleniumScript.g:296:3: ( (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* ) | ( (lv_selectors_6_0= ruleSelector ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=19 && LA7_0<=23)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumScript.g:297:4: (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* )
                    {
                    // InternalSeleniumScript.g:297:4: (otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )* )
                    // InternalSeleniumScript.g:298:5: otherlv_1= '(' ( (lv_selectors_2_0= ruleSelector ) ) otherlv_3= ')' ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )*
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getSelectorsAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalSeleniumScript.g:302:5: ( (lv_selectors_2_0= ruleSelector ) )
                    // InternalSeleniumScript.g:303:6: (lv_selectors_2_0= ruleSelector )
                    {
                    // InternalSeleniumScript.g:303:6: (lv_selectors_2_0= ruleSelector )
                    // InternalSeleniumScript.g:304:7: lv_selectors_2_0= ruleSelector
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
                    				
                    // InternalSeleniumScript.g:325:5: ( ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==28) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSeleniumScript.g:326:6: ruleSELECTOR_COMBINATOR ( (lv_selectors_5_0= ruleSelector ) )
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelectorsAccess().getSELECTOR_COMBINATORParserRuleCall_1_0_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    ruleSELECTOR_COMBINATOR();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					
                    	    // InternalSeleniumScript.g:333:6: ( (lv_selectors_5_0= ruleSelector ) )
                    	    // InternalSeleniumScript.g:334:7: (lv_selectors_5_0= ruleSelector )
                    	    {
                    	    // InternalSeleniumScript.g:334:7: (lv_selectors_5_0= ruleSelector )
                    	    // InternalSeleniumScript.g:335:8: lv_selectors_5_0= ruleSelector
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
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:355:4: ( (lv_selectors_6_0= ruleSelector ) )
                    {
                    // InternalSeleniumScript.g:355:4: ( (lv_selectors_6_0= ruleSelector ) )
                    // InternalSeleniumScript.g:356:5: (lv_selectors_6_0= ruleSelector )
                    {
                    // InternalSeleniumScript.g:356:5: (lv_selectors_6_0= ruleSelector )
                    // InternalSeleniumScript.g:357:6: lv_selectors_6_0= ruleSelector
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
    // InternalSeleniumScript.g:383:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalSeleniumScript.g:383:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalSeleniumScript.g:384:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalSeleniumScript.g:390:1: ruleSelector returns [EObject current=null] : ( ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_propSelectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token this_WHITE_SPACE_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_propSelectors_2_0 = null;

        EObject lv_propSelectors_4_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:396:2: ( ( ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_propSelectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )? ) )
            // InternalSeleniumScript.g:397:2: ( ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_propSelectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )? )
            {
            // InternalSeleniumScript.g:397:2: ( ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_propSelectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )? )
            // InternalSeleniumScript.g:398:3: ( (lv_name_0_0= ruleElem ) ) (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_propSelectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )?
            {
            // InternalSeleniumScript.g:398:3: ( (lv_name_0_0= ruleElem ) )
            // InternalSeleniumScript.g:399:4: (lv_name_0_0= ruleElem )
            {
            // InternalSeleniumScript.g:399:4: (lv_name_0_0= ruleElem )
            // InternalSeleniumScript.g:400:5: lv_name_0_0= ruleElem
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getNameElemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalSeleniumScript.g:417:3: (this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_propSelectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_WHITE_SPACE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSeleniumScript.g:418:4: this_WHITE_SPACE_1= RULE_WHITE_SPACE ( ( (lv_propSelectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* )
                    {
                    this_WHITE_SPACE_1=(Token)match(input,RULE_WHITE_SPACE,FOLLOW_11); 

                    				newLeafNode(this_WHITE_SPACE_1, grammarAccess.getSelectorAccess().getWHITE_SPACETerminalRuleCall_1_0());
                    			
                    // InternalSeleniumScript.g:422:4: ( ( (lv_propSelectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )* )
                    // InternalSeleniumScript.g:423:5: ( (lv_propSelectors_2_0= rulePropSelector ) ) ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )*
                    {
                    // InternalSeleniumScript.g:423:5: ( (lv_propSelectors_2_0= rulePropSelector ) )
                    // InternalSeleniumScript.g:424:6: (lv_propSelectors_2_0= rulePropSelector )
                    {
                    // InternalSeleniumScript.g:424:6: (lv_propSelectors_2_0= rulePropSelector )
                    // InternalSeleniumScript.g:425:7: lv_propSelectors_2_0= rulePropSelector
                    {

                    							newCompositeNode(grammarAccess.getSelectorAccess().getPropSelectorsPropSelectorParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_propSelectors_2_0=rulePropSelector();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSelectorRule());
                    							}
                    							add(
                    								current,
                    								"propSelectors",
                    								lv_propSelectors_2_0,
                    								"emn.fil.a3.SeleniumScript.PropSelector");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSeleniumScript.g:442:5: ( rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_WHITE_SPACE) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSeleniumScript.g:443:6: rulePROP_SELECTOR_COMBINATOR ( (lv_propSelectors_4_0= rulePropSelector ) )
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelectorAccess().getPROP_SELECTOR_COMBINATORParserRuleCall_1_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    rulePROP_SELECTOR_COMBINATOR();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					
                    	    // InternalSeleniumScript.g:450:6: ( (lv_propSelectors_4_0= rulePropSelector ) )
                    	    // InternalSeleniumScript.g:451:7: (lv_propSelectors_4_0= rulePropSelector )
                    	    {
                    	    // InternalSeleniumScript.g:451:7: (lv_propSelectors_4_0= rulePropSelector )
                    	    // InternalSeleniumScript.g:452:8: lv_propSelectors_4_0= rulePropSelector
                    	    {

                    	    								newCompositeNode(grammarAccess.getSelectorAccess().getPropSelectorsPropSelectorParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop8;
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
    // InternalSeleniumScript.g:476:1: entryRuleElem returns [String current=null] : iv_ruleElem= ruleElem EOF ;
    public final String entryRuleElem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElem = null;


        try {
            // InternalSeleniumScript.g:476:44: (iv_ruleElem= ruleElem EOF )
            // InternalSeleniumScript.g:477:2: iv_ruleElem= ruleElem EOF
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
    // InternalSeleniumScript.g:483:1: ruleElem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'field' | kw= 'button' | kw= 'checkbox' | kw= 'link' | kw= 'select' ) ;
    public final AntlrDatatypeRuleToken ruleElem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:489:2: ( (kw= 'field' | kw= 'button' | kw= 'checkbox' | kw= 'link' | kw= 'select' ) )
            // InternalSeleniumScript.g:490:2: (kw= 'field' | kw= 'button' | kw= 'checkbox' | kw= 'link' | kw= 'select' )
            {
            // InternalSeleniumScript.g:490:2: (kw= 'field' | kw= 'button' | kw= 'checkbox' | kw= 'link' | kw= 'select' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            case 23:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSeleniumScript.g:491:3: kw= 'field'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElemAccess().getFieldKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:497:3: kw= 'button'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElemAccess().getButtonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:503:3: kw= 'checkbox'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElemAccess().getCheckboxKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:509:3: kw= 'link'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElemAccess().getLinkKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleniumScript.g:515:3: kw= 'select'
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
    // InternalSeleniumScript.g:524:1: entryRulePropSelector returns [EObject current=null] : iv_rulePropSelector= rulePropSelector EOF ;
    public final EObject entryRulePropSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropSelector = null;


        try {
            // InternalSeleniumScript.g:524:53: (iv_rulePropSelector= rulePropSelector EOF )
            // InternalSeleniumScript.g:525:2: iv_rulePropSelector= rulePropSelector EOF
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
    // InternalSeleniumScript.g:531:1: rulePropSelector returns [EObject current=null] : ( ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePrimary ) ) ) ;
    public final EObject rulePropSelector() throws RecognitionException {
        EObject current = null;

        Token this_WHITE_SPACE_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:537:2: ( ( ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePrimary ) ) ) )
            // InternalSeleniumScript.g:538:2: ( ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePrimary ) ) )
            {
            // InternalSeleniumScript.g:538:2: ( ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePrimary ) ) )
            // InternalSeleniumScript.g:539:3: ( (lv_name_0_0= ruleProp ) ) this_WHITE_SPACE_1= RULE_WHITE_SPACE ( (lv_param_2_0= rulePrimary ) )
            {
            // InternalSeleniumScript.g:539:3: ( (lv_name_0_0= ruleProp ) )
            // InternalSeleniumScript.g:540:4: (lv_name_0_0= ruleProp )
            {
            // InternalSeleniumScript.g:540:4: (lv_name_0_0= ruleProp )
            // InternalSeleniumScript.g:541:5: lv_name_0_0= ruleProp
            {

            					newCompositeNode(grammarAccess.getPropSelectorAccess().getNamePropParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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
            		
            // InternalSeleniumScript.g:562:3: ( (lv_param_2_0= rulePrimary ) )
            // InternalSeleniumScript.g:563:4: (lv_param_2_0= rulePrimary )
            {
            // InternalSeleniumScript.g:563:4: (lv_param_2_0= rulePrimary )
            // InternalSeleniumScript.g:564:5: lv_param_2_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getPropSelectorAccess().getParamPrimaryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_param_2_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropSelectorRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"emn.fil.a3.SeleniumScript.Primary");
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
    // InternalSeleniumScript.g:585:1: entryRuleProp returns [String current=null] : iv_ruleProp= ruleProp EOF ;
    public final String entryRuleProp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProp = null;


        try {
            // InternalSeleniumScript.g:585:44: (iv_ruleProp= ruleProp EOF )
            // InternalSeleniumScript.g:586:2: iv_ruleProp= ruleProp EOF
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
    // InternalSeleniumScript.g:592:1: ruleProp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'id' | kw= 'class' | kw= 'name' | kw= 'value' ) ;
    public final AntlrDatatypeRuleToken ruleProp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:598:2: ( (kw= 'id' | kw= 'class' | kw= 'name' | kw= 'value' ) )
            // InternalSeleniumScript.g:599:2: (kw= 'id' | kw= 'class' | kw= 'name' | kw= 'value' )
            {
            // InternalSeleniumScript.g:599:2: (kw= 'id' | kw= 'class' | kw= 'name' | kw= 'value' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSeleniumScript.g:600:3: kw= 'id'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropAccess().getIdKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:606:3: kw= 'class'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:612:3: kw= 'name'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropAccess().getNameKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:618:3: kw= 'value'
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


    // $ANTLR start "entryRulePrimary"
    // InternalSeleniumScript.g:627:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSeleniumScript.g:627:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSeleniumScript.g:628:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSeleniumScript.g:634:1: rulePrimary returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntValue_1 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:640:2: ( (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue ) )
            // InternalSeleniumScript.g:641:2: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue )
            {
            // InternalSeleniumScript.g:641:2: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumScript.g:642:3: this_StringValue_0= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getStringValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:651:3: this_IntValue_1= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_1=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_1;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleStringValue"
    // InternalSeleniumScript.g:663:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSeleniumScript.g:663:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSeleniumScript.g:664:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalSeleniumScript.g:670:1: ruleStringValue returns [EObject current=null] : ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_ID ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:676:2: ( ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_ID ) ) ) )
            // InternalSeleniumScript.g:677:2: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_ID ) ) )
            {
            // InternalSeleniumScript.g:677:2: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_ID ) ) )
            // InternalSeleniumScript.g:678:3: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_ID ) )
            {
            // InternalSeleniumScript.g:678:3: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_ID ) )
            // InternalSeleniumScript.g:679:4: (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_ID )
            {
            // InternalSeleniumScript.g:679:4: (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSeleniumScript.g:680:5: lv_value_0_1= RULE_STRING
                    {
                    lv_value_0_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:695:5: lv_value_0_2= RULE_ID
                    {
                    lv_value_0_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getStringValueAccess().getValueIDTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }
                    break;

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalSeleniumScript.g:715:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalSeleniumScript.g:715:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalSeleniumScript.g:716:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalSeleniumScript.g:722:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:728:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSeleniumScript.g:729:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSeleniumScript.g:729:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSeleniumScript.g:730:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSeleniumScript.g:730:3: (lv_value_0_0= RULE_INT )
            // InternalSeleniumScript.g:731:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleSEPARATOR"
    // InternalSeleniumScript.g:750:1: entryRuleSEPARATOR returns [String current=null] : iv_ruleSEPARATOR= ruleSEPARATOR EOF ;
    public final String entryRuleSEPARATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEPARATOR = null;


        try {
            // InternalSeleniumScript.g:750:49: (iv_ruleSEPARATOR= ruleSEPARATOR EOF )
            // InternalSeleniumScript.g:751:2: iv_ruleSEPARATOR= ruleSEPARATOR EOF
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
    // InternalSeleniumScript.g:757:1: ruleSEPARATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_WHITE_SPACE_0= RULE_WHITE_SPACE ;
    public final AntlrDatatypeRuleToken ruleSEPARATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WHITE_SPACE_0=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:763:2: (this_WHITE_SPACE_0= RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:764:2: this_WHITE_SPACE_0= RULE_WHITE_SPACE
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
    // InternalSeleniumScript.g:774:1: entryRuleSELECTOR_COMBINATOR returns [String current=null] : iv_ruleSELECTOR_COMBINATOR= ruleSELECTOR_COMBINATOR EOF ;
    public final String entryRuleSELECTOR_COMBINATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSELECTOR_COMBINATOR = null;


        try {
            // InternalSeleniumScript.g:774:59: (iv_ruleSELECTOR_COMBINATOR= ruleSELECTOR_COMBINATOR EOF )
            // InternalSeleniumScript.g:775:2: iv_ruleSELECTOR_COMBINATOR= ruleSELECTOR_COMBINATOR EOF
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
    // InternalSeleniumScript.g:781:1: ruleSELECTOR_COMBINATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruleSELECTOR_COMBINATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:787:2: (kw= '.' )
            // InternalSeleniumScript.g:788:2: kw= '.'
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
    // InternalSeleniumScript.g:796:1: entryRulePROP_SELECTOR_COMBINATOR returns [String current=null] : iv_rulePROP_SELECTOR_COMBINATOR= rulePROP_SELECTOR_COMBINATOR EOF ;
    public final String entryRulePROP_SELECTOR_COMBINATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePROP_SELECTOR_COMBINATOR = null;


        try {
            // InternalSeleniumScript.g:796:64: (iv_rulePROP_SELECTOR_COMBINATOR= rulePROP_SELECTOR_COMBINATOR EOF )
            // InternalSeleniumScript.g:797:2: iv_rulePROP_SELECTOR_COMBINATOR= rulePROP_SELECTOR_COMBINATOR EOF
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
    // InternalSeleniumScript.g:803:1: rulePROP_SELECTOR_COMBINATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_WHITE_SPACE_0= RULE_WHITE_SPACE ;
    public final AntlrDatatypeRuleToken rulePROP_SELECTOR_COMBINATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WHITE_SPACE_0=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:809:2: (this_WHITE_SPACE_0= RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:810:2: this_WHITE_SPACE_0= RULE_WHITE_SPACE
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020380L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000FA0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});

}
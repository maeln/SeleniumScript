package emn.fil.a3.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import emn.fil.a3.services.SeleniumScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WHITE_SPACE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_END_OF_LINE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "'open'", "'go'", "'click'", "'fill'", "'field'", "'button'", "'checkbox'", "'link'", "'select'", "'id'", "'class'", "'name'", "'value'", "'('", "')'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_END_OF_LINE=9;
    public static final int RULE_ID=6;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_WHITE_SPACE=4;
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

    	public void setGrammarAccess(SeleniumScriptGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleScript"
    // InternalSeleniumScript.g:53:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:54:1: ( ruleScript EOF )
            // InternalSeleniumScript.g:55:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalSeleniumScript.g:62:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:66:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalSeleniumScript.g:67:2: ( ( rule__Script__Group__0 ) )
            {
            // InternalSeleniumScript.g:67:2: ( ( rule__Script__Group__0 ) )
            // InternalSeleniumScript.g:68:3: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // InternalSeleniumScript.g:69:3: ( rule__Script__Group__0 )
            // InternalSeleniumScript.g:69:4: rule__Script__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleFunction"
    // InternalSeleniumScript.g:78:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:79:1: ( ruleFunction EOF )
            // InternalSeleniumScript.g:80:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalSeleniumScript.g:87:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:91:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalSeleniumScript.g:92:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalSeleniumScript.g:92:2: ( ( rule__Function__Group__0 ) )
            // InternalSeleniumScript.g:93:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalSeleniumScript.g:94:3: ( rule__Function__Group__0 )
            // InternalSeleniumScript.g:94:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFun"
    // InternalSeleniumScript.g:103:1: entryRuleFun : ruleFun EOF ;
    public final void entryRuleFun() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:104:1: ( ruleFun EOF )
            // InternalSeleniumScript.g:105:1: ruleFun EOF
            {
             before(grammarAccess.getFunRule()); 
            pushFollow(FOLLOW_1);
            ruleFun();

            state._fsp--;

             after(grammarAccess.getFunRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // InternalSeleniumScript.g:112:1: ruleFun : ( ( rule__Fun__Alternatives ) ) ;
    public final void ruleFun() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:116:2: ( ( ( rule__Fun__Alternatives ) ) )
            // InternalSeleniumScript.g:117:2: ( ( rule__Fun__Alternatives ) )
            {
            // InternalSeleniumScript.g:117:2: ( ( rule__Fun__Alternatives ) )
            // InternalSeleniumScript.g:118:3: ( rule__Fun__Alternatives )
            {
             before(grammarAccess.getFunAccess().getAlternatives()); 
            // InternalSeleniumScript.g:119:3: ( rule__Fun__Alternatives )
            // InternalSeleniumScript.g:119:4: rule__Fun__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Fun__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleExpression"
    // InternalSeleniumScript.g:128:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:129:1: ( ruleExpression EOF )
            // InternalSeleniumScript.g:130:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSeleniumScript.g:137:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:141:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalSeleniumScript.g:142:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalSeleniumScript.g:142:2: ( ( rule__Expression__Alternatives ) )
            // InternalSeleniumScript.g:143:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalSeleniumScript.g:144:3: ( rule__Expression__Alternatives )
            // InternalSeleniumScript.g:144:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSelectors"
    // InternalSeleniumScript.g:153:1: entryRuleSelectors : ruleSelectors EOF ;
    public final void entryRuleSelectors() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:154:1: ( ruleSelectors EOF )
            // InternalSeleniumScript.g:155:1: ruleSelectors EOF
            {
             before(grammarAccess.getSelectorsRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectors();

            state._fsp--;

             after(grammarAccess.getSelectorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectors"


    // $ANTLR start "ruleSelectors"
    // InternalSeleniumScript.g:162:1: ruleSelectors : ( ( rule__Selectors__Group__0 ) ) ;
    public final void ruleSelectors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:166:2: ( ( ( rule__Selectors__Group__0 ) ) )
            // InternalSeleniumScript.g:167:2: ( ( rule__Selectors__Group__0 ) )
            {
            // InternalSeleniumScript.g:167:2: ( ( rule__Selectors__Group__0 ) )
            // InternalSeleniumScript.g:168:3: ( rule__Selectors__Group__0 )
            {
             before(grammarAccess.getSelectorsAccess().getGroup()); 
            // InternalSeleniumScript.g:169:3: ( rule__Selectors__Group__0 )
            // InternalSeleniumScript.g:169:4: rule__Selectors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selectors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectors"


    // $ANTLR start "entryRuleSelector"
    // InternalSeleniumScript.g:178:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:179:1: ( ruleSelector EOF )
            // InternalSeleniumScript.g:180:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalSeleniumScript.g:187:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:191:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalSeleniumScript.g:192:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalSeleniumScript.g:192:2: ( ( rule__Selector__Group__0 ) )
            // InternalSeleniumScript.g:193:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalSeleniumScript.g:194:3: ( rule__Selector__Group__0 )
            // InternalSeleniumScript.g:194:4: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleElem"
    // InternalSeleniumScript.g:203:1: entryRuleElem : ruleElem EOF ;
    public final void entryRuleElem() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:204:1: ( ruleElem EOF )
            // InternalSeleniumScript.g:205:1: ruleElem EOF
            {
             before(grammarAccess.getElemRule()); 
            pushFollow(FOLLOW_1);
            ruleElem();

            state._fsp--;

             after(grammarAccess.getElemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElem"


    // $ANTLR start "ruleElem"
    // InternalSeleniumScript.g:212:1: ruleElem : ( ( rule__Elem__Alternatives ) ) ;
    public final void ruleElem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:216:2: ( ( ( rule__Elem__Alternatives ) ) )
            // InternalSeleniumScript.g:217:2: ( ( rule__Elem__Alternatives ) )
            {
            // InternalSeleniumScript.g:217:2: ( ( rule__Elem__Alternatives ) )
            // InternalSeleniumScript.g:218:3: ( rule__Elem__Alternatives )
            {
             before(grammarAccess.getElemAccess().getAlternatives()); 
            // InternalSeleniumScript.g:219:3: ( rule__Elem__Alternatives )
            // InternalSeleniumScript.g:219:4: rule__Elem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Elem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElem"


    // $ANTLR start "entryRulePropSelector"
    // InternalSeleniumScript.g:228:1: entryRulePropSelector : rulePropSelector EOF ;
    public final void entryRulePropSelector() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:229:1: ( rulePropSelector EOF )
            // InternalSeleniumScript.g:230:1: rulePropSelector EOF
            {
             before(grammarAccess.getPropSelectorRule()); 
            pushFollow(FOLLOW_1);
            rulePropSelector();

            state._fsp--;

             after(grammarAccess.getPropSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropSelector"


    // $ANTLR start "rulePropSelector"
    // InternalSeleniumScript.g:237:1: rulePropSelector : ( ( rule__PropSelector__Group__0 ) ) ;
    public final void rulePropSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:241:2: ( ( ( rule__PropSelector__Group__0 ) ) )
            // InternalSeleniumScript.g:242:2: ( ( rule__PropSelector__Group__0 ) )
            {
            // InternalSeleniumScript.g:242:2: ( ( rule__PropSelector__Group__0 ) )
            // InternalSeleniumScript.g:243:3: ( rule__PropSelector__Group__0 )
            {
             before(grammarAccess.getPropSelectorAccess().getGroup()); 
            // InternalSeleniumScript.g:244:3: ( rule__PropSelector__Group__0 )
            // InternalSeleniumScript.g:244:4: rule__PropSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropSelector"


    // $ANTLR start "entryRuleProp"
    // InternalSeleniumScript.g:253:1: entryRuleProp : ruleProp EOF ;
    public final void entryRuleProp() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:254:1: ( ruleProp EOF )
            // InternalSeleniumScript.g:255:1: ruleProp EOF
            {
             before(grammarAccess.getPropRule()); 
            pushFollow(FOLLOW_1);
            ruleProp();

            state._fsp--;

             after(grammarAccess.getPropRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProp"


    // $ANTLR start "ruleProp"
    // InternalSeleniumScript.g:262:1: ruleProp : ( ( rule__Prop__Alternatives ) ) ;
    public final void ruleProp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:266:2: ( ( ( rule__Prop__Alternatives ) ) )
            // InternalSeleniumScript.g:267:2: ( ( rule__Prop__Alternatives ) )
            {
            // InternalSeleniumScript.g:267:2: ( ( rule__Prop__Alternatives ) )
            // InternalSeleniumScript.g:268:3: ( rule__Prop__Alternatives )
            {
             before(grammarAccess.getPropAccess().getAlternatives()); 
            // InternalSeleniumScript.g:269:3: ( rule__Prop__Alternatives )
            // InternalSeleniumScript.g:269:4: rule__Prop__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Prop__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProp"


    // $ANTLR start "entryRulePRIMARY"
    // InternalSeleniumScript.g:278:1: entryRulePRIMARY : rulePRIMARY EOF ;
    public final void entryRulePRIMARY() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:279:1: ( rulePRIMARY EOF )
            // InternalSeleniumScript.g:280:1: rulePRIMARY EOF
            {
             before(grammarAccess.getPRIMARYRule()); 
            pushFollow(FOLLOW_1);
            rulePRIMARY();

            state._fsp--;

             after(grammarAccess.getPRIMARYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePRIMARY"


    // $ANTLR start "rulePRIMARY"
    // InternalSeleniumScript.g:287:1: rulePRIMARY : ( ( rule__PRIMARY__Alternatives ) ) ;
    public final void rulePRIMARY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:291:2: ( ( ( rule__PRIMARY__Alternatives ) ) )
            // InternalSeleniumScript.g:292:2: ( ( rule__PRIMARY__Alternatives ) )
            {
            // InternalSeleniumScript.g:292:2: ( ( rule__PRIMARY__Alternatives ) )
            // InternalSeleniumScript.g:293:3: ( rule__PRIMARY__Alternatives )
            {
             before(grammarAccess.getPRIMARYAccess().getAlternatives()); 
            // InternalSeleniumScript.g:294:3: ( rule__PRIMARY__Alternatives )
            // InternalSeleniumScript.g:294:4: rule__PRIMARY__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PRIMARY__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPRIMARYAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePRIMARY"


    // $ANTLR start "entryRuleSEPARATOR"
    // InternalSeleniumScript.g:303:1: entryRuleSEPARATOR : ruleSEPARATOR EOF ;
    public final void entryRuleSEPARATOR() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:304:1: ( ruleSEPARATOR EOF )
            // InternalSeleniumScript.g:305:1: ruleSEPARATOR EOF
            {
             before(grammarAccess.getSEPARATORRule()); 
            pushFollow(FOLLOW_1);
            ruleSEPARATOR();

            state._fsp--;

             after(grammarAccess.getSEPARATORRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSEPARATOR"


    // $ANTLR start "ruleSEPARATOR"
    // InternalSeleniumScript.g:312:1: ruleSEPARATOR : ( RULE_WHITE_SPACE ) ;
    public final void ruleSEPARATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:316:2: ( ( RULE_WHITE_SPACE ) )
            // InternalSeleniumScript.g:317:2: ( RULE_WHITE_SPACE )
            {
            // InternalSeleniumScript.g:317:2: ( RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:318:3: RULE_WHITE_SPACE
            {
             before(grammarAccess.getSEPARATORAccess().getWHITE_SPACETerminalRuleCall()); 
            match(input,RULE_WHITE_SPACE,FOLLOW_2); 
             after(grammarAccess.getSEPARATORAccess().getWHITE_SPACETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSEPARATOR"


    // $ANTLR start "entryRuleSELECTOR_COMBINATOR"
    // InternalSeleniumScript.g:328:1: entryRuleSELECTOR_COMBINATOR : ruleSELECTOR_COMBINATOR EOF ;
    public final void entryRuleSELECTOR_COMBINATOR() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:329:1: ( ruleSELECTOR_COMBINATOR EOF )
            // InternalSeleniumScript.g:330:1: ruleSELECTOR_COMBINATOR EOF
            {
             before(grammarAccess.getSELECTOR_COMBINATORRule()); 
            pushFollow(FOLLOW_1);
            ruleSELECTOR_COMBINATOR();

            state._fsp--;

             after(grammarAccess.getSELECTOR_COMBINATORRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSELECTOR_COMBINATOR"


    // $ANTLR start "ruleSELECTOR_COMBINATOR"
    // InternalSeleniumScript.g:337:1: ruleSELECTOR_COMBINATOR : ( '.' ) ;
    public final void ruleSELECTOR_COMBINATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:341:2: ( ( '.' ) )
            // InternalSeleniumScript.g:342:2: ( '.' )
            {
            // InternalSeleniumScript.g:342:2: ( '.' )
            // InternalSeleniumScript.g:343:3: '.'
            {
             before(grammarAccess.getSELECTOR_COMBINATORAccess().getFullStopKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSELECTOR_COMBINATORAccess().getFullStopKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSELECTOR_COMBINATOR"


    // $ANTLR start "entryRulePROP_SELECTOR_COMBINATOR"
    // InternalSeleniumScript.g:353:1: entryRulePROP_SELECTOR_COMBINATOR : rulePROP_SELECTOR_COMBINATOR EOF ;
    public final void entryRulePROP_SELECTOR_COMBINATOR() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:354:1: ( rulePROP_SELECTOR_COMBINATOR EOF )
            // InternalSeleniumScript.g:355:1: rulePROP_SELECTOR_COMBINATOR EOF
            {
             before(grammarAccess.getPROP_SELECTOR_COMBINATORRule()); 
            pushFollow(FOLLOW_1);
            rulePROP_SELECTOR_COMBINATOR();

            state._fsp--;

             after(grammarAccess.getPROP_SELECTOR_COMBINATORRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePROP_SELECTOR_COMBINATOR"


    // $ANTLR start "rulePROP_SELECTOR_COMBINATOR"
    // InternalSeleniumScript.g:362:1: rulePROP_SELECTOR_COMBINATOR : ( RULE_WHITE_SPACE ) ;
    public final void rulePROP_SELECTOR_COMBINATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:366:2: ( ( RULE_WHITE_SPACE ) )
            // InternalSeleniumScript.g:367:2: ( RULE_WHITE_SPACE )
            {
            // InternalSeleniumScript.g:367:2: ( RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:368:3: RULE_WHITE_SPACE
            {
             before(grammarAccess.getPROP_SELECTOR_COMBINATORAccess().getWHITE_SPACETerminalRuleCall()); 
            match(input,RULE_WHITE_SPACE,FOLLOW_2); 
             after(grammarAccess.getPROP_SELECTOR_COMBINATORAccess().getWHITE_SPACETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePROP_SELECTOR_COMBINATOR"


    // $ANTLR start "rule__Fun__Alternatives"
    // InternalSeleniumScript.g:377:1: rule__Fun__Alternatives : ( ( 'open' ) | ( 'go' ) | ( 'click' ) | ( 'fill' ) );
    public final void rule__Fun__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:381:1: ( ( 'open' ) | ( 'go' ) | ( 'click' ) | ( 'fill' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSeleniumScript.g:382:2: ( 'open' )
                    {
                    // InternalSeleniumScript.g:382:2: ( 'open' )
                    // InternalSeleniumScript.g:383:3: 'open'
                    {
                     before(grammarAccess.getFunAccess().getOpenKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFunAccess().getOpenKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:388:2: ( 'go' )
                    {
                    // InternalSeleniumScript.g:388:2: ( 'go' )
                    // InternalSeleniumScript.g:389:3: 'go'
                    {
                     before(grammarAccess.getFunAccess().getGoKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getFunAccess().getGoKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:394:2: ( 'click' )
                    {
                    // InternalSeleniumScript.g:394:2: ( 'click' )
                    // InternalSeleniumScript.g:395:3: 'click'
                    {
                     before(grammarAccess.getFunAccess().getClickKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFunAccess().getClickKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:400:2: ( 'fill' )
                    {
                    // InternalSeleniumScript.g:400:2: ( 'fill' )
                    // InternalSeleniumScript.g:401:3: 'fill'
                    {
                     before(grammarAccess.getFunAccess().getFillKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFunAccess().getFillKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalSeleniumScript.g:410:1: rule__Expression__Alternatives : ( ( ruleSelectors ) | ( rulePRIMARY ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:414:1: ( ( ruleSelectors ) | ( rulePRIMARY ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_INT)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSeleniumScript.g:415:2: ( ruleSelectors )
                    {
                    // InternalSeleniumScript.g:415:2: ( ruleSelectors )
                    // InternalSeleniumScript.g:416:3: ruleSelectors
                    {
                     before(grammarAccess.getExpressionAccess().getSelectorsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectors();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getSelectorsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:421:2: ( rulePRIMARY )
                    {
                    // InternalSeleniumScript.g:421:2: ( rulePRIMARY )
                    // InternalSeleniumScript.g:422:3: rulePRIMARY
                    {
                     before(grammarAccess.getExpressionAccess().getPRIMARYParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePRIMARY();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getPRIMARYParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Selectors__Alternatives_1"
    // InternalSeleniumScript.g:431:1: rule__Selectors__Alternatives_1 : ( ( ( rule__Selectors__Group_1_0__0 ) ) | ( ( rule__Selectors__SelectorsAssignment_1_1 ) ) );
    public final void rule__Selectors__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:435:1: ( ( ( rule__Selectors__Group_1_0__0 ) ) | ( ( rule__Selectors__SelectorsAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=18 && LA3_0<=22)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSeleniumScript.g:436:2: ( ( rule__Selectors__Group_1_0__0 ) )
                    {
                    // InternalSeleniumScript.g:436:2: ( ( rule__Selectors__Group_1_0__0 ) )
                    // InternalSeleniumScript.g:437:3: ( rule__Selectors__Group_1_0__0 )
                    {
                     before(grammarAccess.getSelectorsAccess().getGroup_1_0()); 
                    // InternalSeleniumScript.g:438:3: ( rule__Selectors__Group_1_0__0 )
                    // InternalSeleniumScript.g:438:4: rule__Selectors__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selectors__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:442:2: ( ( rule__Selectors__SelectorsAssignment_1_1 ) )
                    {
                    // InternalSeleniumScript.g:442:2: ( ( rule__Selectors__SelectorsAssignment_1_1 ) )
                    // InternalSeleniumScript.g:443:3: ( rule__Selectors__SelectorsAssignment_1_1 )
                    {
                     before(grammarAccess.getSelectorsAccess().getSelectorsAssignment_1_1()); 
                    // InternalSeleniumScript.g:444:3: ( rule__Selectors__SelectorsAssignment_1_1 )
                    // InternalSeleniumScript.g:444:4: rule__Selectors__SelectorsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selectors__SelectorsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorsAccess().getSelectorsAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Alternatives_1"


    // $ANTLR start "rule__Elem__Alternatives"
    // InternalSeleniumScript.g:452:1: rule__Elem__Alternatives : ( ( 'field' ) | ( 'button' ) | ( 'checkbox' ) | ( 'link' ) | ( 'select' ) );
    public final void rule__Elem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:456:1: ( ( 'field' ) | ( 'button' ) | ( 'checkbox' ) | ( 'link' ) | ( 'select' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSeleniumScript.g:457:2: ( 'field' )
                    {
                    // InternalSeleniumScript.g:457:2: ( 'field' )
                    // InternalSeleniumScript.g:458:3: 'field'
                    {
                     before(grammarAccess.getElemAccess().getFieldKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElemAccess().getFieldKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:463:2: ( 'button' )
                    {
                    // InternalSeleniumScript.g:463:2: ( 'button' )
                    // InternalSeleniumScript.g:464:3: 'button'
                    {
                     before(grammarAccess.getElemAccess().getButtonKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getElemAccess().getButtonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:469:2: ( 'checkbox' )
                    {
                    // InternalSeleniumScript.g:469:2: ( 'checkbox' )
                    // InternalSeleniumScript.g:470:3: 'checkbox'
                    {
                     before(grammarAccess.getElemAccess().getCheckboxKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getElemAccess().getCheckboxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:475:2: ( 'link' )
                    {
                    // InternalSeleniumScript.g:475:2: ( 'link' )
                    // InternalSeleniumScript.g:476:3: 'link'
                    {
                     before(grammarAccess.getElemAccess().getLinkKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getElemAccess().getLinkKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSeleniumScript.g:481:2: ( 'select' )
                    {
                    // InternalSeleniumScript.g:481:2: ( 'select' )
                    // InternalSeleniumScript.g:482:3: 'select'
                    {
                     before(grammarAccess.getElemAccess().getSelectKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getElemAccess().getSelectKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elem__Alternatives"


    // $ANTLR start "rule__Prop__Alternatives"
    // InternalSeleniumScript.g:491:1: rule__Prop__Alternatives : ( ( 'id' ) | ( 'class' ) | ( 'name' ) | ( 'value' ) );
    public final void rule__Prop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:495:1: ( ( 'id' ) | ( 'class' ) | ( 'name' ) | ( 'value' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSeleniumScript.g:496:2: ( 'id' )
                    {
                    // InternalSeleniumScript.g:496:2: ( 'id' )
                    // InternalSeleniumScript.g:497:3: 'id'
                    {
                     before(grammarAccess.getPropAccess().getIdKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getPropAccess().getIdKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:502:2: ( 'class' )
                    {
                    // InternalSeleniumScript.g:502:2: ( 'class' )
                    // InternalSeleniumScript.g:503:3: 'class'
                    {
                     before(grammarAccess.getPropAccess().getClassKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getPropAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:508:2: ( 'name' )
                    {
                    // InternalSeleniumScript.g:508:2: ( 'name' )
                    // InternalSeleniumScript.g:509:3: 'name'
                    {
                     before(grammarAccess.getPropAccess().getNameKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getPropAccess().getNameKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:514:2: ( 'value' )
                    {
                    // InternalSeleniumScript.g:514:2: ( 'value' )
                    // InternalSeleniumScript.g:515:3: 'value'
                    {
                     before(grammarAccess.getPropAccess().getValueKeyword_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getPropAccess().getValueKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prop__Alternatives"


    // $ANTLR start "rule__PRIMARY__Alternatives"
    // InternalSeleniumScript.g:524:1: rule__PRIMARY__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__PRIMARY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:528:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSeleniumScript.g:529:2: ( RULE_STRING )
                    {
                    // InternalSeleniumScript.g:529:2: ( RULE_STRING )
                    // InternalSeleniumScript.g:530:3: RULE_STRING
                    {
                     before(grammarAccess.getPRIMARYAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getPRIMARYAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:535:2: ( RULE_ID )
                    {
                    // InternalSeleniumScript.g:535:2: ( RULE_ID )
                    // InternalSeleniumScript.g:536:3: RULE_ID
                    {
                     before(grammarAccess.getPRIMARYAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getPRIMARYAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:541:2: ( RULE_INT )
                    {
                    // InternalSeleniumScript.g:541:2: ( RULE_INT )
                    // InternalSeleniumScript.g:542:3: RULE_INT
                    {
                     before(grammarAccess.getPRIMARYAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getPRIMARYAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PRIMARY__Alternatives"


    // $ANTLR start "rule__Script__Group__0"
    // InternalSeleniumScript.g:551:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:555:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalSeleniumScript.g:556:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // InternalSeleniumScript.g:563:1: rule__Script__Group__0__Impl : ( ( rule__Script__FunctionsAssignment_0 ) ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:567:1: ( ( ( rule__Script__FunctionsAssignment_0 ) ) )
            // InternalSeleniumScript.g:568:1: ( ( rule__Script__FunctionsAssignment_0 ) )
            {
            // InternalSeleniumScript.g:568:1: ( ( rule__Script__FunctionsAssignment_0 ) )
            // InternalSeleniumScript.g:569:2: ( rule__Script__FunctionsAssignment_0 )
            {
             before(grammarAccess.getScriptAccess().getFunctionsAssignment_0()); 
            // InternalSeleniumScript.g:570:2: ( rule__Script__FunctionsAssignment_0 )
            // InternalSeleniumScript.g:570:3: rule__Script__FunctionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Script__FunctionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getFunctionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // InternalSeleniumScript.g:578:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:582:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // InternalSeleniumScript.g:583:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // InternalSeleniumScript.g:590:1: rule__Script__Group__1__Impl : ( ( rule__Script__Group_1__0 )* ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:594:1: ( ( ( rule__Script__Group_1__0 )* ) )
            // InternalSeleniumScript.g:595:1: ( ( rule__Script__Group_1__0 )* )
            {
            // InternalSeleniumScript.g:595:1: ( ( rule__Script__Group_1__0 )* )
            // InternalSeleniumScript.g:596:2: ( rule__Script__Group_1__0 )*
            {
             before(grammarAccess.getScriptAccess().getGroup_1()); 
            // InternalSeleniumScript.g:597:2: ( rule__Script__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_END_OF_LINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSeleniumScript.g:597:3: rule__Script__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Script__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // InternalSeleniumScript.g:605:1: rule__Script__Group__2 : rule__Script__Group__2__Impl ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:609:1: ( rule__Script__Group__2__Impl )
            // InternalSeleniumScript.g:610:2: rule__Script__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // InternalSeleniumScript.g:616:1: rule__Script__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:620:1: ( ( ( RULE_WS )* ) )
            // InternalSeleniumScript.g:621:1: ( ( RULE_WS )* )
            {
            // InternalSeleniumScript.g:621:1: ( ( RULE_WS )* )
            // InternalSeleniumScript.g:622:2: ( RULE_WS )*
            {
             before(grammarAccess.getScriptAccess().getWSTerminalRuleCall_2()); 
            // InternalSeleniumScript.g:623:2: ( RULE_WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeleniumScript.g:623:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__Script__Group_1__0"
    // InternalSeleniumScript.g:632:1: rule__Script__Group_1__0 : rule__Script__Group_1__0__Impl rule__Script__Group_1__1 ;
    public final void rule__Script__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:636:1: ( rule__Script__Group_1__0__Impl rule__Script__Group_1__1 )
            // InternalSeleniumScript.g:637:2: rule__Script__Group_1__0__Impl rule__Script__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Script__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_1__0"


    // $ANTLR start "rule__Script__Group_1__0__Impl"
    // InternalSeleniumScript.g:644:1: rule__Script__Group_1__0__Impl : ( RULE_END_OF_LINE ) ;
    public final void rule__Script__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:648:1: ( ( RULE_END_OF_LINE ) )
            // InternalSeleniumScript.g:649:1: ( RULE_END_OF_LINE )
            {
            // InternalSeleniumScript.g:649:1: ( RULE_END_OF_LINE )
            // InternalSeleniumScript.g:650:2: RULE_END_OF_LINE
            {
             before(grammarAccess.getScriptAccess().getEND_OF_LINETerminalRuleCall_1_0()); 
            match(input,RULE_END_OF_LINE,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getEND_OF_LINETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_1__0__Impl"


    // $ANTLR start "rule__Script__Group_1__1"
    // InternalSeleniumScript.g:659:1: rule__Script__Group_1__1 : rule__Script__Group_1__1__Impl ;
    public final void rule__Script__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:663:1: ( rule__Script__Group_1__1__Impl )
            // InternalSeleniumScript.g:664:2: rule__Script__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_1__1"


    // $ANTLR start "rule__Script__Group_1__1__Impl"
    // InternalSeleniumScript.g:670:1: rule__Script__Group_1__1__Impl : ( ( rule__Script__FunctionsAssignment_1_1 ) ) ;
    public final void rule__Script__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:674:1: ( ( ( rule__Script__FunctionsAssignment_1_1 ) ) )
            // InternalSeleniumScript.g:675:1: ( ( rule__Script__FunctionsAssignment_1_1 ) )
            {
            // InternalSeleniumScript.g:675:1: ( ( rule__Script__FunctionsAssignment_1_1 ) )
            // InternalSeleniumScript.g:676:2: ( rule__Script__FunctionsAssignment_1_1 )
            {
             before(grammarAccess.getScriptAccess().getFunctionsAssignment_1_1()); 
            // InternalSeleniumScript.g:677:2: ( rule__Script__FunctionsAssignment_1_1 )
            // InternalSeleniumScript.g:677:3: rule__Script__FunctionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Script__FunctionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getFunctionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_1__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalSeleniumScript.g:686:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:690:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalSeleniumScript.g:691:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalSeleniumScript.g:698:1: rule__Function__Group__0__Impl : ( ( rule__Function__NameAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:702:1: ( ( ( rule__Function__NameAssignment_0 ) ) )
            // InternalSeleniumScript.g:703:1: ( ( rule__Function__NameAssignment_0 ) )
            {
            // InternalSeleniumScript.g:703:1: ( ( rule__Function__NameAssignment_0 ) )
            // InternalSeleniumScript.g:704:2: ( rule__Function__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_0()); 
            // InternalSeleniumScript.g:705:2: ( rule__Function__NameAssignment_0 )
            // InternalSeleniumScript.g:705:3: rule__Function__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalSeleniumScript.g:713:1: rule__Function__Group__1 : rule__Function__Group__1__Impl ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:717:1: ( rule__Function__Group__1__Impl )
            // InternalSeleniumScript.g:718:2: rule__Function__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalSeleniumScript.g:724:1: rule__Function__Group__1__Impl : ( ( rule__Function__Group_1__0 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:728:1: ( ( ( rule__Function__Group_1__0 ) ) )
            // InternalSeleniumScript.g:729:1: ( ( rule__Function__Group_1__0 ) )
            {
            // InternalSeleniumScript.g:729:1: ( ( rule__Function__Group_1__0 ) )
            // InternalSeleniumScript.g:730:2: ( rule__Function__Group_1__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup_1()); 
            // InternalSeleniumScript.g:731:2: ( rule__Function__Group_1__0 )
            // InternalSeleniumScript.g:731:3: rule__Function__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group_1__0"
    // InternalSeleniumScript.g:740:1: rule__Function__Group_1__0 : rule__Function__Group_1__0__Impl rule__Function__Group_1__1 ;
    public final void rule__Function__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:744:1: ( rule__Function__Group_1__0__Impl rule__Function__Group_1__1 )
            // InternalSeleniumScript.g:745:2: rule__Function__Group_1__0__Impl rule__Function__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__0"


    // $ANTLR start "rule__Function__Group_1__0__Impl"
    // InternalSeleniumScript.g:752:1: rule__Function__Group_1__0__Impl : ( ruleSEPARATOR ) ;
    public final void rule__Function__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:756:1: ( ( ruleSEPARATOR ) )
            // InternalSeleniumScript.g:757:1: ( ruleSEPARATOR )
            {
            // InternalSeleniumScript.g:757:1: ( ruleSEPARATOR )
            // InternalSeleniumScript.g:758:2: ruleSEPARATOR
            {
             before(grammarAccess.getFunctionAccess().getSEPARATORParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSEPARATOR();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getSEPARATORParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__0__Impl"


    // $ANTLR start "rule__Function__Group_1__1"
    // InternalSeleniumScript.g:767:1: rule__Function__Group_1__1 : rule__Function__Group_1__1__Impl ;
    public final void rule__Function__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:771:1: ( rule__Function__Group_1__1__Impl )
            // InternalSeleniumScript.g:772:2: rule__Function__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__1"


    // $ANTLR start "rule__Function__Group_1__1__Impl"
    // InternalSeleniumScript.g:778:1: rule__Function__Group_1__1__Impl : ( ( rule__Function__ParamsAssignment_1_1 ) ) ;
    public final void rule__Function__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:782:1: ( ( ( rule__Function__ParamsAssignment_1_1 ) ) )
            // InternalSeleniumScript.g:783:1: ( ( rule__Function__ParamsAssignment_1_1 ) )
            {
            // InternalSeleniumScript.g:783:1: ( ( rule__Function__ParamsAssignment_1_1 ) )
            // InternalSeleniumScript.g:784:2: ( rule__Function__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getParamsAssignment_1_1()); 
            // InternalSeleniumScript.g:785:2: ( rule__Function__ParamsAssignment_1_1 )
            // InternalSeleniumScript.g:785:3: rule__Function__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__ParamsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getParamsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__1__Impl"


    // $ANTLR start "rule__Selectors__Group__0"
    // InternalSeleniumScript.g:794:1: rule__Selectors__Group__0 : rule__Selectors__Group__0__Impl rule__Selectors__Group__1 ;
    public final void rule__Selectors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:798:1: ( rule__Selectors__Group__0__Impl rule__Selectors__Group__1 )
            // InternalSeleniumScript.g:799:2: rule__Selectors__Group__0__Impl rule__Selectors__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Selectors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group__0"


    // $ANTLR start "rule__Selectors__Group__0__Impl"
    // InternalSeleniumScript.g:806:1: rule__Selectors__Group__0__Impl : ( '(' ) ;
    public final void rule__Selectors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:810:1: ( ( '(' ) )
            // InternalSeleniumScript.g:811:1: ( '(' )
            {
            // InternalSeleniumScript.g:811:1: ( '(' )
            // InternalSeleniumScript.g:812:2: '('
            {
             before(grammarAccess.getSelectorsAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectorsAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group__0__Impl"


    // $ANTLR start "rule__Selectors__Group__1"
    // InternalSeleniumScript.g:821:1: rule__Selectors__Group__1 : rule__Selectors__Group__1__Impl rule__Selectors__Group__2 ;
    public final void rule__Selectors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:825:1: ( rule__Selectors__Group__1__Impl rule__Selectors__Group__2 )
            // InternalSeleniumScript.g:826:2: rule__Selectors__Group__1__Impl rule__Selectors__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Selectors__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectors__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group__1"


    // $ANTLR start "rule__Selectors__Group__1__Impl"
    // InternalSeleniumScript.g:833:1: rule__Selectors__Group__1__Impl : ( ( rule__Selectors__Alternatives_1 ) ) ;
    public final void rule__Selectors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:837:1: ( ( ( rule__Selectors__Alternatives_1 ) ) )
            // InternalSeleniumScript.g:838:1: ( ( rule__Selectors__Alternatives_1 ) )
            {
            // InternalSeleniumScript.g:838:1: ( ( rule__Selectors__Alternatives_1 ) )
            // InternalSeleniumScript.g:839:2: ( rule__Selectors__Alternatives_1 )
            {
             before(grammarAccess.getSelectorsAccess().getAlternatives_1()); 
            // InternalSeleniumScript.g:840:2: ( rule__Selectors__Alternatives_1 )
            // InternalSeleniumScript.g:840:3: rule__Selectors__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Selectors__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group__1__Impl"


    // $ANTLR start "rule__Selectors__Group__2"
    // InternalSeleniumScript.g:848:1: rule__Selectors__Group__2 : rule__Selectors__Group__2__Impl ;
    public final void rule__Selectors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:852:1: ( rule__Selectors__Group__2__Impl )
            // InternalSeleniumScript.g:853:2: rule__Selectors__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selectors__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group__2"


    // $ANTLR start "rule__Selectors__Group__2__Impl"
    // InternalSeleniumScript.g:859:1: rule__Selectors__Group__2__Impl : ( ')' ) ;
    public final void rule__Selectors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:863:1: ( ( ')' ) )
            // InternalSeleniumScript.g:864:1: ( ')' )
            {
            // InternalSeleniumScript.g:864:1: ( ')' )
            // InternalSeleniumScript.g:865:2: ')'
            {
             before(grammarAccess.getSelectorsAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectorsAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group__2__Impl"


    // $ANTLR start "rule__Selectors__Group_1_0__0"
    // InternalSeleniumScript.g:875:1: rule__Selectors__Group_1_0__0 : rule__Selectors__Group_1_0__0__Impl rule__Selectors__Group_1_0__1 ;
    public final void rule__Selectors__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:879:1: ( rule__Selectors__Group_1_0__0__Impl rule__Selectors__Group_1_0__1 )
            // InternalSeleniumScript.g:880:2: rule__Selectors__Group_1_0__0__Impl rule__Selectors__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Selectors__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectors__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0__0"


    // $ANTLR start "rule__Selectors__Group_1_0__0__Impl"
    // InternalSeleniumScript.g:887:1: rule__Selectors__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__Selectors__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:891:1: ( ( '(' ) )
            // InternalSeleniumScript.g:892:1: ( '(' )
            {
            // InternalSeleniumScript.g:892:1: ( '(' )
            // InternalSeleniumScript.g:893:2: '('
            {
             before(grammarAccess.getSelectorsAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectorsAccess().getLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0__0__Impl"


    // $ANTLR start "rule__Selectors__Group_1_0__1"
    // InternalSeleniumScript.g:902:1: rule__Selectors__Group_1_0__1 : rule__Selectors__Group_1_0__1__Impl rule__Selectors__Group_1_0__2 ;
    public final void rule__Selectors__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:906:1: ( rule__Selectors__Group_1_0__1__Impl rule__Selectors__Group_1_0__2 )
            // InternalSeleniumScript.g:907:2: rule__Selectors__Group_1_0__1__Impl rule__Selectors__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Selectors__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectors__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0__1"


    // $ANTLR start "rule__Selectors__Group_1_0__1__Impl"
    // InternalSeleniumScript.g:914:1: rule__Selectors__Group_1_0__1__Impl : ( ( rule__Selectors__SelectorsAssignment_1_0_1 ) ) ;
    public final void rule__Selectors__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:918:1: ( ( ( rule__Selectors__SelectorsAssignment_1_0_1 ) ) )
            // InternalSeleniumScript.g:919:1: ( ( rule__Selectors__SelectorsAssignment_1_0_1 ) )
            {
            // InternalSeleniumScript.g:919:1: ( ( rule__Selectors__SelectorsAssignment_1_0_1 ) )
            // InternalSeleniumScript.g:920:2: ( rule__Selectors__SelectorsAssignment_1_0_1 )
            {
             before(grammarAccess.getSelectorsAccess().getSelectorsAssignment_1_0_1()); 
            // InternalSeleniumScript.g:921:2: ( rule__Selectors__SelectorsAssignment_1_0_1 )
            // InternalSeleniumScript.g:921:3: rule__Selectors__SelectorsAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Selectors__SelectorsAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorsAccess().getSelectorsAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0__1__Impl"


    // $ANTLR start "rule__Selectors__Group_1_0__2"
    // InternalSeleniumScript.g:929:1: rule__Selectors__Group_1_0__2 : rule__Selectors__Group_1_0__2__Impl rule__Selectors__Group_1_0__3 ;
    public final void rule__Selectors__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:933:1: ( rule__Selectors__Group_1_0__2__Impl rule__Selectors__Group_1_0__3 )
            // InternalSeleniumScript.g:934:2: rule__Selectors__Group_1_0__2__Impl rule__Selectors__Group_1_0__3
            {
            pushFollow(FOLLOW_11);
            rule__Selectors__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectors__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0__2"


    // $ANTLR start "rule__Selectors__Group_1_0__2__Impl"
    // InternalSeleniumScript.g:941:1: rule__Selectors__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Selectors__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:945:1: ( ( ')' ) )
            // InternalSeleniumScript.g:946:1: ( ')' )
            {
            // InternalSeleniumScript.g:946:1: ( ')' )
            // InternalSeleniumScript.g:947:2: ')'
            {
             before(grammarAccess.getSelectorsAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectorsAccess().getRightParenthesisKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0__2__Impl"


    // $ANTLR start "rule__Selectors__Group_1_0__3"
    // InternalSeleniumScript.g:956:1: rule__Selectors__Group_1_0__3 : rule__Selectors__Group_1_0__3__Impl ;
    public final void rule__Selectors__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:960:1: ( rule__Selectors__Group_1_0__3__Impl )
            // InternalSeleniumScript.g:961:2: rule__Selectors__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selectors__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0__3"


    // $ANTLR start "rule__Selectors__Group_1_0__3__Impl"
    // InternalSeleniumScript.g:967:1: rule__Selectors__Group_1_0__3__Impl : ( ( rule__Selectors__Group_1_0_3__0 )* ) ;
    public final void rule__Selectors__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:971:1: ( ( ( rule__Selectors__Group_1_0_3__0 )* ) )
            // InternalSeleniumScript.g:972:1: ( ( rule__Selectors__Group_1_0_3__0 )* )
            {
            // InternalSeleniumScript.g:972:1: ( ( rule__Selectors__Group_1_0_3__0 )* )
            // InternalSeleniumScript.g:973:2: ( rule__Selectors__Group_1_0_3__0 )*
            {
             before(grammarAccess.getSelectorsAccess().getGroup_1_0_3()); 
            // InternalSeleniumScript.g:974:2: ( rule__Selectors__Group_1_0_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSeleniumScript.g:974:3: rule__Selectors__Group_1_0_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Selectors__Group_1_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSelectorsAccess().getGroup_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0__3__Impl"


    // $ANTLR start "rule__Selectors__Group_1_0_3__0"
    // InternalSeleniumScript.g:983:1: rule__Selectors__Group_1_0_3__0 : rule__Selectors__Group_1_0_3__0__Impl rule__Selectors__Group_1_0_3__1 ;
    public final void rule__Selectors__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:987:1: ( rule__Selectors__Group_1_0_3__0__Impl rule__Selectors__Group_1_0_3__1 )
            // InternalSeleniumScript.g:988:2: rule__Selectors__Group_1_0_3__0__Impl rule__Selectors__Group_1_0_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Selectors__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selectors__Group_1_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0_3__0"


    // $ANTLR start "rule__Selectors__Group_1_0_3__0__Impl"
    // InternalSeleniumScript.g:995:1: rule__Selectors__Group_1_0_3__0__Impl : ( ruleSELECTOR_COMBINATOR ) ;
    public final void rule__Selectors__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:999:1: ( ( ruleSELECTOR_COMBINATOR ) )
            // InternalSeleniumScript.g:1000:1: ( ruleSELECTOR_COMBINATOR )
            {
            // InternalSeleniumScript.g:1000:1: ( ruleSELECTOR_COMBINATOR )
            // InternalSeleniumScript.g:1001:2: ruleSELECTOR_COMBINATOR
            {
             before(grammarAccess.getSelectorsAccess().getSELECTOR_COMBINATORParserRuleCall_1_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSELECTOR_COMBINATOR();

            state._fsp--;

             after(grammarAccess.getSelectorsAccess().getSELECTOR_COMBINATORParserRuleCall_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Selectors__Group_1_0_3__1"
    // InternalSeleniumScript.g:1010:1: rule__Selectors__Group_1_0_3__1 : rule__Selectors__Group_1_0_3__1__Impl ;
    public final void rule__Selectors__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1014:1: ( rule__Selectors__Group_1_0_3__1__Impl )
            // InternalSeleniumScript.g:1015:2: rule__Selectors__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selectors__Group_1_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0_3__1"


    // $ANTLR start "rule__Selectors__Group_1_0_3__1__Impl"
    // InternalSeleniumScript.g:1021:1: rule__Selectors__Group_1_0_3__1__Impl : ( ( rule__Selectors__SelectorsAssignment_1_0_3_1 ) ) ;
    public final void rule__Selectors__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1025:1: ( ( ( rule__Selectors__SelectorsAssignment_1_0_3_1 ) ) )
            // InternalSeleniumScript.g:1026:1: ( ( rule__Selectors__SelectorsAssignment_1_0_3_1 ) )
            {
            // InternalSeleniumScript.g:1026:1: ( ( rule__Selectors__SelectorsAssignment_1_0_3_1 ) )
            // InternalSeleniumScript.g:1027:2: ( rule__Selectors__SelectorsAssignment_1_0_3_1 )
            {
             before(grammarAccess.getSelectorsAccess().getSelectorsAssignment_1_0_3_1()); 
            // InternalSeleniumScript.g:1028:2: ( rule__Selectors__SelectorsAssignment_1_0_3_1 )
            // InternalSeleniumScript.g:1028:3: rule__Selectors__SelectorsAssignment_1_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Selectors__SelectorsAssignment_1_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorsAccess().getSelectorsAssignment_1_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalSeleniumScript.g:1037:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1041:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSeleniumScript.g:1042:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // InternalSeleniumScript.g:1049:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__NameAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1053:1: ( ( ( rule__Selector__NameAssignment_0 ) ) )
            // InternalSeleniumScript.g:1054:1: ( ( rule__Selector__NameAssignment_0 ) )
            {
            // InternalSeleniumScript.g:1054:1: ( ( rule__Selector__NameAssignment_0 ) )
            // InternalSeleniumScript.g:1055:2: ( rule__Selector__NameAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getNameAssignment_0()); 
            // InternalSeleniumScript.g:1056:2: ( rule__Selector__NameAssignment_0 )
            // InternalSeleniumScript.g:1056:3: rule__Selector__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // InternalSeleniumScript.g:1064:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1068:1: ( rule__Selector__Group__1__Impl )
            // InternalSeleniumScript.g:1069:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // InternalSeleniumScript.g:1075:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Group_1__0 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1079:1: ( ( ( rule__Selector__Group_1__0 )? ) )
            // InternalSeleniumScript.g:1080:1: ( ( rule__Selector__Group_1__0 )? )
            {
            // InternalSeleniumScript.g:1080:1: ( ( rule__Selector__Group_1__0 )? )
            // InternalSeleniumScript.g:1081:2: ( rule__Selector__Group_1__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_1()); 
            // InternalSeleniumScript.g:1082:2: ( rule__Selector__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WHITE_SPACE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSeleniumScript.g:1082:3: rule__Selector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group_1__0"
    // InternalSeleniumScript.g:1091:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1095:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // InternalSeleniumScript.g:1096:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Selector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0"


    // $ANTLR start "rule__Selector__Group_1__0__Impl"
    // InternalSeleniumScript.g:1103:1: rule__Selector__Group_1__0__Impl : ( RULE_WHITE_SPACE ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1107:1: ( ( RULE_WHITE_SPACE ) )
            // InternalSeleniumScript.g:1108:1: ( RULE_WHITE_SPACE )
            {
            // InternalSeleniumScript.g:1108:1: ( RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:1109:2: RULE_WHITE_SPACE
            {
             before(grammarAccess.getSelectorAccess().getWHITE_SPACETerminalRuleCall_1_0()); 
            match(input,RULE_WHITE_SPACE,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getWHITE_SPACETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1__1"
    // InternalSeleniumScript.g:1118:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1122:1: ( rule__Selector__Group_1__1__Impl )
            // InternalSeleniumScript.g:1123:2: rule__Selector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__1"


    // $ANTLR start "rule__Selector__Group_1__1__Impl"
    // InternalSeleniumScript.g:1129:1: rule__Selector__Group_1__1__Impl : ( ( rule__Selector__Group_1_1__0 ) ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1133:1: ( ( ( rule__Selector__Group_1_1__0 ) ) )
            // InternalSeleniumScript.g:1134:1: ( ( rule__Selector__Group_1_1__0 ) )
            {
            // InternalSeleniumScript.g:1134:1: ( ( rule__Selector__Group_1_1__0 ) )
            // InternalSeleniumScript.g:1135:2: ( rule__Selector__Group_1_1__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup_1_1()); 
            // InternalSeleniumScript.g:1136:2: ( rule__Selector__Group_1_1__0 )
            // InternalSeleniumScript.g:1136:3: rule__Selector__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__0"
    // InternalSeleniumScript.g:1145:1: rule__Selector__Group_1_1__0 : rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 ;
    public final void rule__Selector__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1149:1: ( rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 )
            // InternalSeleniumScript.g:1150:2: rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Selector__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1__0__Impl"
    // InternalSeleniumScript.g:1157:1: rule__Selector__Group_1_1__0__Impl : ( ( rule__Selector__SelectorsAssignment_1_1_0 ) ) ;
    public final void rule__Selector__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1161:1: ( ( ( rule__Selector__SelectorsAssignment_1_1_0 ) ) )
            // InternalSeleniumScript.g:1162:1: ( ( rule__Selector__SelectorsAssignment_1_1_0 ) )
            {
            // InternalSeleniumScript.g:1162:1: ( ( rule__Selector__SelectorsAssignment_1_1_0 ) )
            // InternalSeleniumScript.g:1163:2: ( rule__Selector__SelectorsAssignment_1_1_0 )
            {
             before(grammarAccess.getSelectorAccess().getSelectorsAssignment_1_1_0()); 
            // InternalSeleniumScript.g:1164:2: ( rule__Selector__SelectorsAssignment_1_1_0 )
            // InternalSeleniumScript.g:1164:3: rule__Selector__SelectorsAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__SelectorsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSelectorsAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__1"
    // InternalSeleniumScript.g:1172:1: rule__Selector__Group_1_1__1 : rule__Selector__Group_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1176:1: ( rule__Selector__Group_1_1__1__Impl )
            // InternalSeleniumScript.g:1177:2: rule__Selector__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1__1__Impl"
    // InternalSeleniumScript.g:1183:1: rule__Selector__Group_1_1__1__Impl : ( ( rule__Selector__Group_1_1_1__0 )* ) ;
    public final void rule__Selector__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1187:1: ( ( ( rule__Selector__Group_1_1_1__0 )* ) )
            // InternalSeleniumScript.g:1188:1: ( ( rule__Selector__Group_1_1_1__0 )* )
            {
            // InternalSeleniumScript.g:1188:1: ( ( rule__Selector__Group_1_1_1__0 )* )
            // InternalSeleniumScript.g:1189:2: ( rule__Selector__Group_1_1_1__0 )*
            {
             before(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 
            // InternalSeleniumScript.g:1190:2: ( rule__Selector__Group_1_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WHITE_SPACE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSeleniumScript.g:1190:3: rule__Selector__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Selector__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__0"
    // InternalSeleniumScript.g:1199:1: rule__Selector__Group_1_1_1__0 : rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 ;
    public final void rule__Selector__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1203:1: ( rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 )
            // InternalSeleniumScript.g:1204:2: rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Selector__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1_1__0__Impl"
    // InternalSeleniumScript.g:1211:1: rule__Selector__Group_1_1_1__0__Impl : ( rulePROP_SELECTOR_COMBINATOR ) ;
    public final void rule__Selector__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1215:1: ( ( rulePROP_SELECTOR_COMBINATOR ) )
            // InternalSeleniumScript.g:1216:1: ( rulePROP_SELECTOR_COMBINATOR )
            {
            // InternalSeleniumScript.g:1216:1: ( rulePROP_SELECTOR_COMBINATOR )
            // InternalSeleniumScript.g:1217:2: rulePROP_SELECTOR_COMBINATOR
            {
             before(grammarAccess.getSelectorAccess().getPROP_SELECTOR_COMBINATORParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePROP_SELECTOR_COMBINATOR();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getPROP_SELECTOR_COMBINATORParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__1"
    // InternalSeleniumScript.g:1226:1: rule__Selector__Group_1_1_1__1 : rule__Selector__Group_1_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1230:1: ( rule__Selector__Group_1_1_1__1__Impl )
            // InternalSeleniumScript.g:1231:2: rule__Selector__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1_1__1__Impl"
    // InternalSeleniumScript.g:1237:1: rule__Selector__Group_1_1_1__1__Impl : ( ( rule__Selector__PropSelectorsAssignment_1_1_1_1 ) ) ;
    public final void rule__Selector__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1241:1: ( ( ( rule__Selector__PropSelectorsAssignment_1_1_1_1 ) ) )
            // InternalSeleniumScript.g:1242:1: ( ( rule__Selector__PropSelectorsAssignment_1_1_1_1 ) )
            {
            // InternalSeleniumScript.g:1242:1: ( ( rule__Selector__PropSelectorsAssignment_1_1_1_1 ) )
            // InternalSeleniumScript.g:1243:2: ( rule__Selector__PropSelectorsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getPropSelectorsAssignment_1_1_1_1()); 
            // InternalSeleniumScript.g:1244:2: ( rule__Selector__PropSelectorsAssignment_1_1_1_1 )
            // InternalSeleniumScript.g:1244:3: rule__Selector__PropSelectorsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__PropSelectorsAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getPropSelectorsAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__PropSelector__Group__0"
    // InternalSeleniumScript.g:1253:1: rule__PropSelector__Group__0 : rule__PropSelector__Group__0__Impl rule__PropSelector__Group__1 ;
    public final void rule__PropSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1257:1: ( rule__PropSelector__Group__0__Impl rule__PropSelector__Group__1 )
            // InternalSeleniumScript.g:1258:2: rule__PropSelector__Group__0__Impl rule__PropSelector__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PropSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropSelector__Group__0"


    // $ANTLR start "rule__PropSelector__Group__0__Impl"
    // InternalSeleniumScript.g:1265:1: rule__PropSelector__Group__0__Impl : ( ( rule__PropSelector__NameAssignment_0 ) ) ;
    public final void rule__PropSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1269:1: ( ( ( rule__PropSelector__NameAssignment_0 ) ) )
            // InternalSeleniumScript.g:1270:1: ( ( rule__PropSelector__NameAssignment_0 ) )
            {
            // InternalSeleniumScript.g:1270:1: ( ( rule__PropSelector__NameAssignment_0 ) )
            // InternalSeleniumScript.g:1271:2: ( rule__PropSelector__NameAssignment_0 )
            {
             before(grammarAccess.getPropSelectorAccess().getNameAssignment_0()); 
            // InternalSeleniumScript.g:1272:2: ( rule__PropSelector__NameAssignment_0 )
            // InternalSeleniumScript.g:1272:3: rule__PropSelector__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PropSelector__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropSelectorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropSelector__Group__0__Impl"


    // $ANTLR start "rule__PropSelector__Group__1"
    // InternalSeleniumScript.g:1280:1: rule__PropSelector__Group__1 : rule__PropSelector__Group__1__Impl rule__PropSelector__Group__2 ;
    public final void rule__PropSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1284:1: ( rule__PropSelector__Group__1__Impl rule__PropSelector__Group__2 )
            // InternalSeleniumScript.g:1285:2: rule__PropSelector__Group__1__Impl rule__PropSelector__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PropSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropSelector__Group__1"


    // $ANTLR start "rule__PropSelector__Group__1__Impl"
    // InternalSeleniumScript.g:1292:1: rule__PropSelector__Group__1__Impl : ( RULE_WHITE_SPACE ) ;
    public final void rule__PropSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1296:1: ( ( RULE_WHITE_SPACE ) )
            // InternalSeleniumScript.g:1297:1: ( RULE_WHITE_SPACE )
            {
            // InternalSeleniumScript.g:1297:1: ( RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:1298:2: RULE_WHITE_SPACE
            {
             before(grammarAccess.getPropSelectorAccess().getWHITE_SPACETerminalRuleCall_1()); 
            match(input,RULE_WHITE_SPACE,FOLLOW_2); 
             after(grammarAccess.getPropSelectorAccess().getWHITE_SPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropSelector__Group__1__Impl"


    // $ANTLR start "rule__PropSelector__Group__2"
    // InternalSeleniumScript.g:1307:1: rule__PropSelector__Group__2 : rule__PropSelector__Group__2__Impl ;
    public final void rule__PropSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1311:1: ( rule__PropSelector__Group__2__Impl )
            // InternalSeleniumScript.g:1312:2: rule__PropSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropSelector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropSelector__Group__2"


    // $ANTLR start "rule__PropSelector__Group__2__Impl"
    // InternalSeleniumScript.g:1318:1: rule__PropSelector__Group__2__Impl : ( ( rule__PropSelector__ParamAssignment_2 ) ) ;
    public final void rule__PropSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1322:1: ( ( ( rule__PropSelector__ParamAssignment_2 ) ) )
            // InternalSeleniumScript.g:1323:1: ( ( rule__PropSelector__ParamAssignment_2 ) )
            {
            // InternalSeleniumScript.g:1323:1: ( ( rule__PropSelector__ParamAssignment_2 ) )
            // InternalSeleniumScript.g:1324:2: ( rule__PropSelector__ParamAssignment_2 )
            {
             before(grammarAccess.getPropSelectorAccess().getParamAssignment_2()); 
            // InternalSeleniumScript.g:1325:2: ( rule__PropSelector__ParamAssignment_2 )
            // InternalSeleniumScript.g:1325:3: rule__PropSelector__ParamAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropSelector__ParamAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropSelectorAccess().getParamAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropSelector__Group__2__Impl"


    // $ANTLR start "rule__Script__FunctionsAssignment_0"
    // InternalSeleniumScript.g:1334:1: rule__Script__FunctionsAssignment_0 : ( ruleFunction ) ;
    public final void rule__Script__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1338:1: ( ( ruleFunction ) )
            // InternalSeleniumScript.g:1339:2: ( ruleFunction )
            {
            // InternalSeleniumScript.g:1339:2: ( ruleFunction )
            // InternalSeleniumScript.g:1340:3: ruleFunction
            {
             before(grammarAccess.getScriptAccess().getFunctionsFunctionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getFunctionsFunctionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__FunctionsAssignment_0"


    // $ANTLR start "rule__Script__FunctionsAssignment_1_1"
    // InternalSeleniumScript.g:1349:1: rule__Script__FunctionsAssignment_1_1 : ( ruleFunction ) ;
    public final void rule__Script__FunctionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1353:1: ( ( ruleFunction ) )
            // InternalSeleniumScript.g:1354:2: ( ruleFunction )
            {
            // InternalSeleniumScript.g:1354:2: ( ruleFunction )
            // InternalSeleniumScript.g:1355:3: ruleFunction
            {
             before(grammarAccess.getScriptAccess().getFunctionsFunctionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getFunctionsFunctionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__FunctionsAssignment_1_1"


    // $ANTLR start "rule__Function__NameAssignment_0"
    // InternalSeleniumScript.g:1364:1: rule__Function__NameAssignment_0 : ( ruleFun ) ;
    public final void rule__Function__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1368:1: ( ( ruleFun ) )
            // InternalSeleniumScript.g:1369:2: ( ruleFun )
            {
            // InternalSeleniumScript.g:1369:2: ( ruleFun )
            // InternalSeleniumScript.g:1370:3: ruleFun
            {
             before(grammarAccess.getFunctionAccess().getNameFunParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFun();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getNameFunParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_0"


    // $ANTLR start "rule__Function__ParamsAssignment_1_1"
    // InternalSeleniumScript.g:1379:1: rule__Function__ParamsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Function__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1383:1: ( ( ruleExpression ) )
            // InternalSeleniumScript.g:1384:2: ( ruleExpression )
            {
            // InternalSeleniumScript.g:1384:2: ( ruleExpression )
            // InternalSeleniumScript.g:1385:3: ruleExpression
            {
             before(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParamsAssignment_1_1"


    // $ANTLR start "rule__Selectors__SelectorsAssignment_1_0_1"
    // InternalSeleniumScript.g:1394:1: rule__Selectors__SelectorsAssignment_1_0_1 : ( ruleSelector ) ;
    public final void rule__Selectors__SelectorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1398:1: ( ( ruleSelector ) )
            // InternalSeleniumScript.g:1399:2: ( ruleSelector )
            {
            // InternalSeleniumScript.g:1399:2: ( ruleSelector )
            // InternalSeleniumScript.g:1400:3: ruleSelector
            {
             before(grammarAccess.getSelectorsAccess().getSelectorsSelectorParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorsAccess().getSelectorsSelectorParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__SelectorsAssignment_1_0_1"


    // $ANTLR start "rule__Selectors__SelectorsAssignment_1_0_3_1"
    // InternalSeleniumScript.g:1409:1: rule__Selectors__SelectorsAssignment_1_0_3_1 : ( ruleSelector ) ;
    public final void rule__Selectors__SelectorsAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1413:1: ( ( ruleSelector ) )
            // InternalSeleniumScript.g:1414:2: ( ruleSelector )
            {
            // InternalSeleniumScript.g:1414:2: ( ruleSelector )
            // InternalSeleniumScript.g:1415:3: ruleSelector
            {
             before(grammarAccess.getSelectorsAccess().getSelectorsSelectorParserRuleCall_1_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorsAccess().getSelectorsSelectorParserRuleCall_1_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__SelectorsAssignment_1_0_3_1"


    // $ANTLR start "rule__Selectors__SelectorsAssignment_1_1"
    // InternalSeleniumScript.g:1424:1: rule__Selectors__SelectorsAssignment_1_1 : ( ruleSelector ) ;
    public final void rule__Selectors__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1428:1: ( ( ruleSelector ) )
            // InternalSeleniumScript.g:1429:2: ( ruleSelector )
            {
            // InternalSeleniumScript.g:1429:2: ( ruleSelector )
            // InternalSeleniumScript.g:1430:3: ruleSelector
            {
             before(grammarAccess.getSelectorsAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorsAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selectors__SelectorsAssignment_1_1"


    // $ANTLR start "rule__Selector__NameAssignment_0"
    // InternalSeleniumScript.g:1439:1: rule__Selector__NameAssignment_0 : ( ruleElem ) ;
    public final void rule__Selector__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1443:1: ( ( ruleElem ) )
            // InternalSeleniumScript.g:1444:2: ( ruleElem )
            {
            // InternalSeleniumScript.g:1444:2: ( ruleElem )
            // InternalSeleniumScript.g:1445:3: ruleElem
            {
             before(grammarAccess.getSelectorAccess().getNameElemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElem();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getNameElemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__NameAssignment_0"


    // $ANTLR start "rule__Selector__SelectorsAssignment_1_1_0"
    // InternalSeleniumScript.g:1454:1: rule__Selector__SelectorsAssignment_1_1_0 : ( rulePropSelector ) ;
    public final void rule__Selector__SelectorsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1458:1: ( ( rulePropSelector ) )
            // InternalSeleniumScript.g:1459:2: ( rulePropSelector )
            {
            // InternalSeleniumScript.g:1459:2: ( rulePropSelector )
            // InternalSeleniumScript.g:1460:3: rulePropSelector
            {
             before(grammarAccess.getSelectorAccess().getSelectorsPropSelectorParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropSelector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSelectorsPropSelectorParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorsAssignment_1_1_0"


    // $ANTLR start "rule__Selector__PropSelectorsAssignment_1_1_1_1"
    // InternalSeleniumScript.g:1469:1: rule__Selector__PropSelectorsAssignment_1_1_1_1 : ( rulePropSelector ) ;
    public final void rule__Selector__PropSelectorsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1473:1: ( ( rulePropSelector ) )
            // InternalSeleniumScript.g:1474:2: ( rulePropSelector )
            {
            // InternalSeleniumScript.g:1474:2: ( rulePropSelector )
            // InternalSeleniumScript.g:1475:3: rulePropSelector
            {
             before(grammarAccess.getSelectorAccess().getPropSelectorsPropSelectorParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropSelector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getPropSelectorsPropSelectorParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__PropSelectorsAssignment_1_1_1_1"


    // $ANTLR start "rule__PropSelector__NameAssignment_0"
    // InternalSeleniumScript.g:1484:1: rule__PropSelector__NameAssignment_0 : ( ruleProp ) ;
    public final void rule__PropSelector__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1488:1: ( ( ruleProp ) )
            // InternalSeleniumScript.g:1489:2: ( ruleProp )
            {
            // InternalSeleniumScript.g:1489:2: ( ruleProp )
            // InternalSeleniumScript.g:1490:3: ruleProp
            {
             before(grammarAccess.getPropSelectorAccess().getNamePropParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProp();

            state._fsp--;

             after(grammarAccess.getPropSelectorAccess().getNamePropParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropSelector__NameAssignment_0"


    // $ANTLR start "rule__PropSelector__ParamAssignment_2"
    // InternalSeleniumScript.g:1499:1: rule__PropSelector__ParamAssignment_2 : ( rulePRIMARY ) ;
    public final void rule__PropSelector__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1503:1: ( ( rulePRIMARY ) )
            // InternalSeleniumScript.g:1504:2: ( rulePRIMARY )
            {
            // InternalSeleniumScript.g:1504:2: ( rulePRIMARY )
            // InternalSeleniumScript.g:1505:3: rulePRIMARY
            {
             before(grammarAccess.getPropSelectorAccess().getParamPRIMARYParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePRIMARY();

            state._fsp--;

             after(grammarAccess.getPropSelectorAccess().getParamPRIMARYParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropSelector__ParamAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000080000E0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000087C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});

}
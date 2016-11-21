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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WHITE_SPACE", "RULE_STRING", "RULE_ID", "RULE_WS", "RULE_END_OF_LINE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "'open'", "'go'", "'click'", "'fill'", "'field'", "'button'", "'checkbox'", "'link'", "'select'", "'id'", "'class'", "'name'", "'value'", "'('", "')'"
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
    public static final int RULE_END_OF_LINE=8;
    public static final int RULE_ID=6;
    public static final int RULE_WS=7;
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


    // $ANTLR start "entryRulePrimary"
    // InternalSeleniumScript.g:278:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:279:1: ( rulePrimary EOF )
            // InternalSeleniumScript.g:280:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSeleniumScript.g:287:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:291:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalSeleniumScript.g:292:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalSeleniumScript.g:292:2: ( ( rule__Primary__Alternatives ) )
            // InternalSeleniumScript.g:293:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalSeleniumScript.g:294:3: ( rule__Primary__Alternatives )
            // InternalSeleniumScript.g:294:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleStringValue"
    // InternalSeleniumScript.g:303:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:304:1: ( ruleStringValue EOF )
            // InternalSeleniumScript.g:305:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalSeleniumScript.g:312:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:316:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalSeleniumScript.g:317:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalSeleniumScript.g:317:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalSeleniumScript.g:318:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalSeleniumScript.g:319:3: ( rule__StringValue__ValueAssignment )
            // InternalSeleniumScript.g:319:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalSeleniumScript.g:328:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:329:1: ( ruleIntValue EOF )
            // InternalSeleniumScript.g:330:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalSeleniumScript.g:337:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:341:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalSeleniumScript.g:342:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalSeleniumScript.g:342:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalSeleniumScript.g:343:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalSeleniumScript.g:344:3: ( rule__IntValue__ValueAssignment )
            // InternalSeleniumScript.g:344:4: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleSEPARATOR"
    // InternalSeleniumScript.g:353:1: entryRuleSEPARATOR : ruleSEPARATOR EOF ;
    public final void entryRuleSEPARATOR() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:354:1: ( ruleSEPARATOR EOF )
            // InternalSeleniumScript.g:355:1: ruleSEPARATOR EOF
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
    // InternalSeleniumScript.g:362:1: ruleSEPARATOR : ( RULE_WHITE_SPACE ) ;
    public final void ruleSEPARATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:366:2: ( ( RULE_WHITE_SPACE ) )
            // InternalSeleniumScript.g:367:2: ( RULE_WHITE_SPACE )
            {
            // InternalSeleniumScript.g:367:2: ( RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:368:3: RULE_WHITE_SPACE
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
    // InternalSeleniumScript.g:378:1: entryRuleSELECTOR_COMBINATOR : ruleSELECTOR_COMBINATOR EOF ;
    public final void entryRuleSELECTOR_COMBINATOR() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:379:1: ( ruleSELECTOR_COMBINATOR EOF )
            // InternalSeleniumScript.g:380:1: ruleSELECTOR_COMBINATOR EOF
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
    // InternalSeleniumScript.g:387:1: ruleSELECTOR_COMBINATOR : ( '.' ) ;
    public final void ruleSELECTOR_COMBINATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:391:2: ( ( '.' ) )
            // InternalSeleniumScript.g:392:2: ( '.' )
            {
            // InternalSeleniumScript.g:392:2: ( '.' )
            // InternalSeleniumScript.g:393:3: '.'
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
    // InternalSeleniumScript.g:403:1: entryRulePROP_SELECTOR_COMBINATOR : rulePROP_SELECTOR_COMBINATOR EOF ;
    public final void entryRulePROP_SELECTOR_COMBINATOR() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:404:1: ( rulePROP_SELECTOR_COMBINATOR EOF )
            // InternalSeleniumScript.g:405:1: rulePROP_SELECTOR_COMBINATOR EOF
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
    // InternalSeleniumScript.g:412:1: rulePROP_SELECTOR_COMBINATOR : ( RULE_WHITE_SPACE ) ;
    public final void rulePROP_SELECTOR_COMBINATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:416:2: ( ( RULE_WHITE_SPACE ) )
            // InternalSeleniumScript.g:417:2: ( RULE_WHITE_SPACE )
            {
            // InternalSeleniumScript.g:417:2: ( RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:418:3: RULE_WHITE_SPACE
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
    // InternalSeleniumScript.g:427:1: rule__Fun__Alternatives : ( ( 'open' ) | ( 'go' ) | ( 'click' ) | ( 'fill' ) );
    public final void rule__Fun__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:431:1: ( ( 'open' ) | ( 'go' ) | ( 'click' ) | ( 'fill' ) )
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
                    // InternalSeleniumScript.g:432:2: ( 'open' )
                    {
                    // InternalSeleniumScript.g:432:2: ( 'open' )
                    // InternalSeleniumScript.g:433:3: 'open'
                    {
                     before(grammarAccess.getFunAccess().getOpenKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFunAccess().getOpenKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:438:2: ( 'go' )
                    {
                    // InternalSeleniumScript.g:438:2: ( 'go' )
                    // InternalSeleniumScript.g:439:3: 'go'
                    {
                     before(grammarAccess.getFunAccess().getGoKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getFunAccess().getGoKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:444:2: ( 'click' )
                    {
                    // InternalSeleniumScript.g:444:2: ( 'click' )
                    // InternalSeleniumScript.g:445:3: 'click'
                    {
                     before(grammarAccess.getFunAccess().getClickKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFunAccess().getClickKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:450:2: ( 'fill' )
                    {
                    // InternalSeleniumScript.g:450:2: ( 'fill' )
                    // InternalSeleniumScript.g:451:3: 'fill'
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
    // InternalSeleniumScript.g:460:1: rule__Expression__Alternatives : ( ( ruleSelectors ) | ( rulePrimary ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:464:1: ( ( ruleSelectors ) | ( rulePrimary ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSeleniumScript.g:465:2: ( ruleSelectors )
                    {
                    // InternalSeleniumScript.g:465:2: ( ruleSelectors )
                    // InternalSeleniumScript.g:466:3: ruleSelectors
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
                    // InternalSeleniumScript.g:471:2: ( rulePrimary )
                    {
                    // InternalSeleniumScript.g:471:2: ( rulePrimary )
                    // InternalSeleniumScript.g:472:3: rulePrimary
                    {
                     before(grammarAccess.getExpressionAccess().getPrimaryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimary();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getPrimaryParserRuleCall_1()); 

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
    // InternalSeleniumScript.g:481:1: rule__Selectors__Alternatives_1 : ( ( ( rule__Selectors__Group_1_0__0 ) ) | ( ( rule__Selectors__SelectorsAssignment_1_1 ) ) );
    public final void rule__Selectors__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:485:1: ( ( ( rule__Selectors__Group_1_0__0 ) ) | ( ( rule__Selectors__SelectorsAssignment_1_1 ) ) )
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
                    // InternalSeleniumScript.g:486:2: ( ( rule__Selectors__Group_1_0__0 ) )
                    {
                    // InternalSeleniumScript.g:486:2: ( ( rule__Selectors__Group_1_0__0 ) )
                    // InternalSeleniumScript.g:487:3: ( rule__Selectors__Group_1_0__0 )
                    {
                     before(grammarAccess.getSelectorsAccess().getGroup_1_0()); 
                    // InternalSeleniumScript.g:488:3: ( rule__Selectors__Group_1_0__0 )
                    // InternalSeleniumScript.g:488:4: rule__Selectors__Group_1_0__0
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
                    // InternalSeleniumScript.g:492:2: ( ( rule__Selectors__SelectorsAssignment_1_1 ) )
                    {
                    // InternalSeleniumScript.g:492:2: ( ( rule__Selectors__SelectorsAssignment_1_1 ) )
                    // InternalSeleniumScript.g:493:3: ( rule__Selectors__SelectorsAssignment_1_1 )
                    {
                     before(grammarAccess.getSelectorsAccess().getSelectorsAssignment_1_1()); 
                    // InternalSeleniumScript.g:494:3: ( rule__Selectors__SelectorsAssignment_1_1 )
                    // InternalSeleniumScript.g:494:4: rule__Selectors__SelectorsAssignment_1_1
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
    // InternalSeleniumScript.g:502:1: rule__Elem__Alternatives : ( ( 'field' ) | ( 'button' ) | ( 'checkbox' ) | ( 'link' ) | ( 'select' ) );
    public final void rule__Elem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:506:1: ( ( 'field' ) | ( 'button' ) | ( 'checkbox' ) | ( 'link' ) | ( 'select' ) )
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
                    // InternalSeleniumScript.g:507:2: ( 'field' )
                    {
                    // InternalSeleniumScript.g:507:2: ( 'field' )
                    // InternalSeleniumScript.g:508:3: 'field'
                    {
                     before(grammarAccess.getElemAccess().getFieldKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElemAccess().getFieldKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:513:2: ( 'button' )
                    {
                    // InternalSeleniumScript.g:513:2: ( 'button' )
                    // InternalSeleniumScript.g:514:3: 'button'
                    {
                     before(grammarAccess.getElemAccess().getButtonKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getElemAccess().getButtonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:519:2: ( 'checkbox' )
                    {
                    // InternalSeleniumScript.g:519:2: ( 'checkbox' )
                    // InternalSeleniumScript.g:520:3: 'checkbox'
                    {
                     before(grammarAccess.getElemAccess().getCheckboxKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getElemAccess().getCheckboxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:525:2: ( 'link' )
                    {
                    // InternalSeleniumScript.g:525:2: ( 'link' )
                    // InternalSeleniumScript.g:526:3: 'link'
                    {
                     before(grammarAccess.getElemAccess().getLinkKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getElemAccess().getLinkKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSeleniumScript.g:531:2: ( 'select' )
                    {
                    // InternalSeleniumScript.g:531:2: ( 'select' )
                    // InternalSeleniumScript.g:532:3: 'select'
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
    // InternalSeleniumScript.g:541:1: rule__Prop__Alternatives : ( ( 'id' ) | ( 'class' ) | ( 'name' ) | ( 'value' ) );
    public final void rule__Prop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:545:1: ( ( 'id' ) | ( 'class' ) | ( 'name' ) | ( 'value' ) )
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
                    // InternalSeleniumScript.g:546:2: ( 'id' )
                    {
                    // InternalSeleniumScript.g:546:2: ( 'id' )
                    // InternalSeleniumScript.g:547:3: 'id'
                    {
                     before(grammarAccess.getPropAccess().getIdKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getPropAccess().getIdKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:552:2: ( 'class' )
                    {
                    // InternalSeleniumScript.g:552:2: ( 'class' )
                    // InternalSeleniumScript.g:553:3: 'class'
                    {
                     before(grammarAccess.getPropAccess().getClassKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getPropAccess().getClassKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:558:2: ( 'name' )
                    {
                    // InternalSeleniumScript.g:558:2: ( 'name' )
                    // InternalSeleniumScript.g:559:3: 'name'
                    {
                     before(grammarAccess.getPropAccess().getNameKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getPropAccess().getNameKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:564:2: ( 'value' )
                    {
                    // InternalSeleniumScript.g:564:2: ( 'value' )
                    // InternalSeleniumScript.g:565:3: 'value'
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


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalSeleniumScript.g:574:1: rule__Primary__Alternatives : ( ( ruleStringValue ) | ( ruleIntValue ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:578:1: ( ( ruleStringValue ) | ( ruleIntValue ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSeleniumScript.g:579:2: ( ruleStringValue )
                    {
                    // InternalSeleniumScript.g:579:2: ( ruleStringValue )
                    // InternalSeleniumScript.g:580:3: ruleStringValue
                    {
                     before(grammarAccess.getPrimaryAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:585:2: ( ruleIntValue )
                    {
                    // InternalSeleniumScript.g:585:2: ( ruleIntValue )
                    // InternalSeleniumScript.g:586:3: ruleIntValue
                    {
                     before(grammarAccess.getPrimaryAccess().getIntValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__StringValue__ValueAlternatives_0"
    // InternalSeleniumScript.g:595:1: rule__StringValue__ValueAlternatives_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__StringValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:599:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumScript.g:600:2: ( RULE_STRING )
                    {
                    // InternalSeleniumScript.g:600:2: ( RULE_STRING )
                    // InternalSeleniumScript.g:601:3: RULE_STRING
                    {
                     before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:606:2: ( RULE_ID )
                    {
                    // InternalSeleniumScript.g:606:2: ( RULE_ID )
                    // InternalSeleniumScript.g:607:3: RULE_ID
                    {
                     before(grammarAccess.getStringValueAccess().getValueIDTerminalRuleCall_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getStringValueAccess().getValueIDTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__StringValue__ValueAlternatives_0"


    // $ANTLR start "rule__Script__Group__0"
    // InternalSeleniumScript.g:616:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:620:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalSeleniumScript.g:621:2: rule__Script__Group__0__Impl rule__Script__Group__1
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
    // InternalSeleniumScript.g:628:1: rule__Script__Group__0__Impl : ( ( rule__Script__FunctionsAssignment_0 ) ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:632:1: ( ( ( rule__Script__FunctionsAssignment_0 ) ) )
            // InternalSeleniumScript.g:633:1: ( ( rule__Script__FunctionsAssignment_0 ) )
            {
            // InternalSeleniumScript.g:633:1: ( ( rule__Script__FunctionsAssignment_0 ) )
            // InternalSeleniumScript.g:634:2: ( rule__Script__FunctionsAssignment_0 )
            {
             before(grammarAccess.getScriptAccess().getFunctionsAssignment_0()); 
            // InternalSeleniumScript.g:635:2: ( rule__Script__FunctionsAssignment_0 )
            // InternalSeleniumScript.g:635:3: rule__Script__FunctionsAssignment_0
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
    // InternalSeleniumScript.g:643:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:647:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // InternalSeleniumScript.g:648:2: rule__Script__Group__1__Impl rule__Script__Group__2
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
    // InternalSeleniumScript.g:655:1: rule__Script__Group__1__Impl : ( ( rule__Script__Group_1__0 )* ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:659:1: ( ( ( rule__Script__Group_1__0 )* ) )
            // InternalSeleniumScript.g:660:1: ( ( rule__Script__Group_1__0 )* )
            {
            // InternalSeleniumScript.g:660:1: ( ( rule__Script__Group_1__0 )* )
            // InternalSeleniumScript.g:661:2: ( rule__Script__Group_1__0 )*
            {
             before(grammarAccess.getScriptAccess().getGroup_1()); 
            // InternalSeleniumScript.g:662:2: ( rule__Script__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_END_OF_LINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeleniumScript.g:662:3: rule__Script__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Script__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSeleniumScript.g:670:1: rule__Script__Group__2 : rule__Script__Group__2__Impl ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:674:1: ( rule__Script__Group__2__Impl )
            // InternalSeleniumScript.g:675:2: rule__Script__Group__2__Impl
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
    // InternalSeleniumScript.g:681:1: rule__Script__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:685:1: ( ( ( RULE_WS )* ) )
            // InternalSeleniumScript.g:686:1: ( ( RULE_WS )* )
            {
            // InternalSeleniumScript.g:686:1: ( ( RULE_WS )* )
            // InternalSeleniumScript.g:687:2: ( RULE_WS )*
            {
             before(grammarAccess.getScriptAccess().getWSTerminalRuleCall_2()); 
            // InternalSeleniumScript.g:688:2: ( RULE_WS )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSeleniumScript.g:688:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSeleniumScript.g:697:1: rule__Script__Group_1__0 : rule__Script__Group_1__0__Impl rule__Script__Group_1__1 ;
    public final void rule__Script__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:701:1: ( rule__Script__Group_1__0__Impl rule__Script__Group_1__1 )
            // InternalSeleniumScript.g:702:2: rule__Script__Group_1__0__Impl rule__Script__Group_1__1
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
    // InternalSeleniumScript.g:709:1: rule__Script__Group_1__0__Impl : ( RULE_END_OF_LINE ) ;
    public final void rule__Script__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:713:1: ( ( RULE_END_OF_LINE ) )
            // InternalSeleniumScript.g:714:1: ( RULE_END_OF_LINE )
            {
            // InternalSeleniumScript.g:714:1: ( RULE_END_OF_LINE )
            // InternalSeleniumScript.g:715:2: RULE_END_OF_LINE
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
    // InternalSeleniumScript.g:724:1: rule__Script__Group_1__1 : rule__Script__Group_1__1__Impl ;
    public final void rule__Script__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:728:1: ( rule__Script__Group_1__1__Impl )
            // InternalSeleniumScript.g:729:2: rule__Script__Group_1__1__Impl
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
    // InternalSeleniumScript.g:735:1: rule__Script__Group_1__1__Impl : ( ( rule__Script__FunctionsAssignment_1_1 ) ) ;
    public final void rule__Script__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:739:1: ( ( ( rule__Script__FunctionsAssignment_1_1 ) ) )
            // InternalSeleniumScript.g:740:1: ( ( rule__Script__FunctionsAssignment_1_1 ) )
            {
            // InternalSeleniumScript.g:740:1: ( ( rule__Script__FunctionsAssignment_1_1 ) )
            // InternalSeleniumScript.g:741:2: ( rule__Script__FunctionsAssignment_1_1 )
            {
             before(grammarAccess.getScriptAccess().getFunctionsAssignment_1_1()); 
            // InternalSeleniumScript.g:742:2: ( rule__Script__FunctionsAssignment_1_1 )
            // InternalSeleniumScript.g:742:3: rule__Script__FunctionsAssignment_1_1
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
    // InternalSeleniumScript.g:751:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:755:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalSeleniumScript.g:756:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalSeleniumScript.g:763:1: rule__Function__Group__0__Impl : ( ( rule__Function__NameAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:767:1: ( ( ( rule__Function__NameAssignment_0 ) ) )
            // InternalSeleniumScript.g:768:1: ( ( rule__Function__NameAssignment_0 ) )
            {
            // InternalSeleniumScript.g:768:1: ( ( rule__Function__NameAssignment_0 ) )
            // InternalSeleniumScript.g:769:2: ( rule__Function__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_0()); 
            // InternalSeleniumScript.g:770:2: ( rule__Function__NameAssignment_0 )
            // InternalSeleniumScript.g:770:3: rule__Function__NameAssignment_0
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
    // InternalSeleniumScript.g:778:1: rule__Function__Group__1 : rule__Function__Group__1__Impl ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:782:1: ( rule__Function__Group__1__Impl )
            // InternalSeleniumScript.g:783:2: rule__Function__Group__1__Impl
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
    // InternalSeleniumScript.g:789:1: rule__Function__Group__1__Impl : ( ( rule__Function__Group_1__0 )* ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:793:1: ( ( ( rule__Function__Group_1__0 )* ) )
            // InternalSeleniumScript.g:794:1: ( ( rule__Function__Group_1__0 )* )
            {
            // InternalSeleniumScript.g:794:1: ( ( rule__Function__Group_1__0 )* )
            // InternalSeleniumScript.g:795:2: ( rule__Function__Group_1__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_1()); 
            // InternalSeleniumScript.g:796:2: ( rule__Function__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WHITE_SPACE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeleniumScript.g:796:3: rule__Function__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Function__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

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
    // InternalSeleniumScript.g:805:1: rule__Function__Group_1__0 : rule__Function__Group_1__0__Impl rule__Function__Group_1__1 ;
    public final void rule__Function__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:809:1: ( rule__Function__Group_1__0__Impl rule__Function__Group_1__1 )
            // InternalSeleniumScript.g:810:2: rule__Function__Group_1__0__Impl rule__Function__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSeleniumScript.g:817:1: rule__Function__Group_1__0__Impl : ( ruleSEPARATOR ) ;
    public final void rule__Function__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:821:1: ( ( ruleSEPARATOR ) )
            // InternalSeleniumScript.g:822:1: ( ruleSEPARATOR )
            {
            // InternalSeleniumScript.g:822:1: ( ruleSEPARATOR )
            // InternalSeleniumScript.g:823:2: ruleSEPARATOR
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
    // InternalSeleniumScript.g:832:1: rule__Function__Group_1__1 : rule__Function__Group_1__1__Impl ;
    public final void rule__Function__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:836:1: ( rule__Function__Group_1__1__Impl )
            // InternalSeleniumScript.g:837:2: rule__Function__Group_1__1__Impl
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
    // InternalSeleniumScript.g:843:1: rule__Function__Group_1__1__Impl : ( ( rule__Function__ParamsAssignment_1_1 ) ) ;
    public final void rule__Function__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:847:1: ( ( ( rule__Function__ParamsAssignment_1_1 ) ) )
            // InternalSeleniumScript.g:848:1: ( ( rule__Function__ParamsAssignment_1_1 ) )
            {
            // InternalSeleniumScript.g:848:1: ( ( rule__Function__ParamsAssignment_1_1 ) )
            // InternalSeleniumScript.g:849:2: ( rule__Function__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getParamsAssignment_1_1()); 
            // InternalSeleniumScript.g:850:2: ( rule__Function__ParamsAssignment_1_1 )
            // InternalSeleniumScript.g:850:3: rule__Function__ParamsAssignment_1_1
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
    // InternalSeleniumScript.g:859:1: rule__Selectors__Group__0 : rule__Selectors__Group__0__Impl rule__Selectors__Group__1 ;
    public final void rule__Selectors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:863:1: ( rule__Selectors__Group__0__Impl rule__Selectors__Group__1 )
            // InternalSeleniumScript.g:864:2: rule__Selectors__Group__0__Impl rule__Selectors__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSeleniumScript.g:871:1: rule__Selectors__Group__0__Impl : ( '(' ) ;
    public final void rule__Selectors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:875:1: ( ( '(' ) )
            // InternalSeleniumScript.g:876:1: ( '(' )
            {
            // InternalSeleniumScript.g:876:1: ( '(' )
            // InternalSeleniumScript.g:877:2: '('
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
    // InternalSeleniumScript.g:886:1: rule__Selectors__Group__1 : rule__Selectors__Group__1__Impl rule__Selectors__Group__2 ;
    public final void rule__Selectors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:890:1: ( rule__Selectors__Group__1__Impl rule__Selectors__Group__2 )
            // InternalSeleniumScript.g:891:2: rule__Selectors__Group__1__Impl rule__Selectors__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumScript.g:898:1: rule__Selectors__Group__1__Impl : ( ( rule__Selectors__Alternatives_1 ) ) ;
    public final void rule__Selectors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:902:1: ( ( ( rule__Selectors__Alternatives_1 ) ) )
            // InternalSeleniumScript.g:903:1: ( ( rule__Selectors__Alternatives_1 ) )
            {
            // InternalSeleniumScript.g:903:1: ( ( rule__Selectors__Alternatives_1 ) )
            // InternalSeleniumScript.g:904:2: ( rule__Selectors__Alternatives_1 )
            {
             before(grammarAccess.getSelectorsAccess().getAlternatives_1()); 
            // InternalSeleniumScript.g:905:2: ( rule__Selectors__Alternatives_1 )
            // InternalSeleniumScript.g:905:3: rule__Selectors__Alternatives_1
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
    // InternalSeleniumScript.g:913:1: rule__Selectors__Group__2 : rule__Selectors__Group__2__Impl ;
    public final void rule__Selectors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:917:1: ( rule__Selectors__Group__2__Impl )
            // InternalSeleniumScript.g:918:2: rule__Selectors__Group__2__Impl
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
    // InternalSeleniumScript.g:924:1: rule__Selectors__Group__2__Impl : ( ')' ) ;
    public final void rule__Selectors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:928:1: ( ( ')' ) )
            // InternalSeleniumScript.g:929:1: ( ')' )
            {
            // InternalSeleniumScript.g:929:1: ( ')' )
            // InternalSeleniumScript.g:930:2: ')'
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
    // InternalSeleniumScript.g:940:1: rule__Selectors__Group_1_0__0 : rule__Selectors__Group_1_0__0__Impl rule__Selectors__Group_1_0__1 ;
    public final void rule__Selectors__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:944:1: ( rule__Selectors__Group_1_0__0__Impl rule__Selectors__Group_1_0__1 )
            // InternalSeleniumScript.g:945:2: rule__Selectors__Group_1_0__0__Impl rule__Selectors__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSeleniumScript.g:952:1: rule__Selectors__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__Selectors__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:956:1: ( ( '(' ) )
            // InternalSeleniumScript.g:957:1: ( '(' )
            {
            // InternalSeleniumScript.g:957:1: ( '(' )
            // InternalSeleniumScript.g:958:2: '('
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
    // InternalSeleniumScript.g:967:1: rule__Selectors__Group_1_0__1 : rule__Selectors__Group_1_0__1__Impl rule__Selectors__Group_1_0__2 ;
    public final void rule__Selectors__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:971:1: ( rule__Selectors__Group_1_0__1__Impl rule__Selectors__Group_1_0__2 )
            // InternalSeleniumScript.g:972:2: rule__Selectors__Group_1_0__1__Impl rule__Selectors__Group_1_0__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumScript.g:979:1: rule__Selectors__Group_1_0__1__Impl : ( ( rule__Selectors__SelectorsAssignment_1_0_1 ) ) ;
    public final void rule__Selectors__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:983:1: ( ( ( rule__Selectors__SelectorsAssignment_1_0_1 ) ) )
            // InternalSeleniumScript.g:984:1: ( ( rule__Selectors__SelectorsAssignment_1_0_1 ) )
            {
            // InternalSeleniumScript.g:984:1: ( ( rule__Selectors__SelectorsAssignment_1_0_1 ) )
            // InternalSeleniumScript.g:985:2: ( rule__Selectors__SelectorsAssignment_1_0_1 )
            {
             before(grammarAccess.getSelectorsAccess().getSelectorsAssignment_1_0_1()); 
            // InternalSeleniumScript.g:986:2: ( rule__Selectors__SelectorsAssignment_1_0_1 )
            // InternalSeleniumScript.g:986:3: rule__Selectors__SelectorsAssignment_1_0_1
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
    // InternalSeleniumScript.g:994:1: rule__Selectors__Group_1_0__2 : rule__Selectors__Group_1_0__2__Impl rule__Selectors__Group_1_0__3 ;
    public final void rule__Selectors__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:998:1: ( rule__Selectors__Group_1_0__2__Impl rule__Selectors__Group_1_0__3 )
            // InternalSeleniumScript.g:999:2: rule__Selectors__Group_1_0__2__Impl rule__Selectors__Group_1_0__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSeleniumScript.g:1006:1: rule__Selectors__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Selectors__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1010:1: ( ( ')' ) )
            // InternalSeleniumScript.g:1011:1: ( ')' )
            {
            // InternalSeleniumScript.g:1011:1: ( ')' )
            // InternalSeleniumScript.g:1012:2: ')'
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
    // InternalSeleniumScript.g:1021:1: rule__Selectors__Group_1_0__3 : rule__Selectors__Group_1_0__3__Impl ;
    public final void rule__Selectors__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1025:1: ( rule__Selectors__Group_1_0__3__Impl )
            // InternalSeleniumScript.g:1026:2: rule__Selectors__Group_1_0__3__Impl
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
    // InternalSeleniumScript.g:1032:1: rule__Selectors__Group_1_0__3__Impl : ( ( rule__Selectors__Group_1_0_3__0 )* ) ;
    public final void rule__Selectors__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1036:1: ( ( ( rule__Selectors__Group_1_0_3__0 )* ) )
            // InternalSeleniumScript.g:1037:1: ( ( rule__Selectors__Group_1_0_3__0 )* )
            {
            // InternalSeleniumScript.g:1037:1: ( ( rule__Selectors__Group_1_0_3__0 )* )
            // InternalSeleniumScript.g:1038:2: ( rule__Selectors__Group_1_0_3__0 )*
            {
             before(grammarAccess.getSelectorsAccess().getGroup_1_0_3()); 
            // InternalSeleniumScript.g:1039:2: ( rule__Selectors__Group_1_0_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSeleniumScript.g:1039:3: rule__Selectors__Group_1_0_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Selectors__Group_1_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSeleniumScript.g:1048:1: rule__Selectors__Group_1_0_3__0 : rule__Selectors__Group_1_0_3__0__Impl rule__Selectors__Group_1_0_3__1 ;
    public final void rule__Selectors__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1052:1: ( rule__Selectors__Group_1_0_3__0__Impl rule__Selectors__Group_1_0_3__1 )
            // InternalSeleniumScript.g:1053:2: rule__Selectors__Group_1_0_3__0__Impl rule__Selectors__Group_1_0_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSeleniumScript.g:1060:1: rule__Selectors__Group_1_0_3__0__Impl : ( ruleSELECTOR_COMBINATOR ) ;
    public final void rule__Selectors__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1064:1: ( ( ruleSELECTOR_COMBINATOR ) )
            // InternalSeleniumScript.g:1065:1: ( ruleSELECTOR_COMBINATOR )
            {
            // InternalSeleniumScript.g:1065:1: ( ruleSELECTOR_COMBINATOR )
            // InternalSeleniumScript.g:1066:2: ruleSELECTOR_COMBINATOR
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
    // InternalSeleniumScript.g:1075:1: rule__Selectors__Group_1_0_3__1 : rule__Selectors__Group_1_0_3__1__Impl ;
    public final void rule__Selectors__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1079:1: ( rule__Selectors__Group_1_0_3__1__Impl )
            // InternalSeleniumScript.g:1080:2: rule__Selectors__Group_1_0_3__1__Impl
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
    // InternalSeleniumScript.g:1086:1: rule__Selectors__Group_1_0_3__1__Impl : ( ( rule__Selectors__SelectorsAssignment_1_0_3_1 ) ) ;
    public final void rule__Selectors__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1090:1: ( ( ( rule__Selectors__SelectorsAssignment_1_0_3_1 ) ) )
            // InternalSeleniumScript.g:1091:1: ( ( rule__Selectors__SelectorsAssignment_1_0_3_1 ) )
            {
            // InternalSeleniumScript.g:1091:1: ( ( rule__Selectors__SelectorsAssignment_1_0_3_1 ) )
            // InternalSeleniumScript.g:1092:2: ( rule__Selectors__SelectorsAssignment_1_0_3_1 )
            {
             before(grammarAccess.getSelectorsAccess().getSelectorsAssignment_1_0_3_1()); 
            // InternalSeleniumScript.g:1093:2: ( rule__Selectors__SelectorsAssignment_1_0_3_1 )
            // InternalSeleniumScript.g:1093:3: rule__Selectors__SelectorsAssignment_1_0_3_1
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
    // InternalSeleniumScript.g:1102:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1106:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSeleniumScript.g:1107:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
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
    // InternalSeleniumScript.g:1114:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__NameAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1118:1: ( ( ( rule__Selector__NameAssignment_0 ) ) )
            // InternalSeleniumScript.g:1119:1: ( ( rule__Selector__NameAssignment_0 ) )
            {
            // InternalSeleniumScript.g:1119:1: ( ( rule__Selector__NameAssignment_0 ) )
            // InternalSeleniumScript.g:1120:2: ( rule__Selector__NameAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getNameAssignment_0()); 
            // InternalSeleniumScript.g:1121:2: ( rule__Selector__NameAssignment_0 )
            // InternalSeleniumScript.g:1121:3: rule__Selector__NameAssignment_0
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
    // InternalSeleniumScript.g:1129:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1133:1: ( rule__Selector__Group__1__Impl )
            // InternalSeleniumScript.g:1134:2: rule__Selector__Group__1__Impl
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
    // InternalSeleniumScript.g:1140:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Group_1__0 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1144:1: ( ( ( rule__Selector__Group_1__0 )? ) )
            // InternalSeleniumScript.g:1145:1: ( ( rule__Selector__Group_1__0 )? )
            {
            // InternalSeleniumScript.g:1145:1: ( ( rule__Selector__Group_1__0 )? )
            // InternalSeleniumScript.g:1146:2: ( rule__Selector__Group_1__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_1()); 
            // InternalSeleniumScript.g:1147:2: ( rule__Selector__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_WHITE_SPACE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumScript.g:1147:3: rule__Selector__Group_1__0
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
    // InternalSeleniumScript.g:1156:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1160:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // InternalSeleniumScript.g:1161:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSeleniumScript.g:1168:1: rule__Selector__Group_1__0__Impl : ( RULE_WHITE_SPACE ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1172:1: ( ( RULE_WHITE_SPACE ) )
            // InternalSeleniumScript.g:1173:1: ( RULE_WHITE_SPACE )
            {
            // InternalSeleniumScript.g:1173:1: ( RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:1174:2: RULE_WHITE_SPACE
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
    // InternalSeleniumScript.g:1183:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1187:1: ( rule__Selector__Group_1__1__Impl )
            // InternalSeleniumScript.g:1188:2: rule__Selector__Group_1__1__Impl
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
    // InternalSeleniumScript.g:1194:1: rule__Selector__Group_1__1__Impl : ( ( rule__Selector__Group_1_1__0 ) ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1198:1: ( ( ( rule__Selector__Group_1_1__0 ) ) )
            // InternalSeleniumScript.g:1199:1: ( ( rule__Selector__Group_1_1__0 ) )
            {
            // InternalSeleniumScript.g:1199:1: ( ( rule__Selector__Group_1_1__0 ) )
            // InternalSeleniumScript.g:1200:2: ( rule__Selector__Group_1_1__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup_1_1()); 
            // InternalSeleniumScript.g:1201:2: ( rule__Selector__Group_1_1__0 )
            // InternalSeleniumScript.g:1201:3: rule__Selector__Group_1_1__0
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
    // InternalSeleniumScript.g:1210:1: rule__Selector__Group_1_1__0 : rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 ;
    public final void rule__Selector__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1214:1: ( rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 )
            // InternalSeleniumScript.g:1215:2: rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1
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
    // InternalSeleniumScript.g:1222:1: rule__Selector__Group_1_1__0__Impl : ( ( rule__Selector__PropSelectorsAssignment_1_1_0 ) ) ;
    public final void rule__Selector__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1226:1: ( ( ( rule__Selector__PropSelectorsAssignment_1_1_0 ) ) )
            // InternalSeleniumScript.g:1227:1: ( ( rule__Selector__PropSelectorsAssignment_1_1_0 ) )
            {
            // InternalSeleniumScript.g:1227:1: ( ( rule__Selector__PropSelectorsAssignment_1_1_0 ) )
            // InternalSeleniumScript.g:1228:2: ( rule__Selector__PropSelectorsAssignment_1_1_0 )
            {
             before(grammarAccess.getSelectorAccess().getPropSelectorsAssignment_1_1_0()); 
            // InternalSeleniumScript.g:1229:2: ( rule__Selector__PropSelectorsAssignment_1_1_0 )
            // InternalSeleniumScript.g:1229:3: rule__Selector__PropSelectorsAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__PropSelectorsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getPropSelectorsAssignment_1_1_0()); 

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
    // InternalSeleniumScript.g:1237:1: rule__Selector__Group_1_1__1 : rule__Selector__Group_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1241:1: ( rule__Selector__Group_1_1__1__Impl )
            // InternalSeleniumScript.g:1242:2: rule__Selector__Group_1_1__1__Impl
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
    // InternalSeleniumScript.g:1248:1: rule__Selector__Group_1_1__1__Impl : ( ( rule__Selector__Group_1_1_1__0 )* ) ;
    public final void rule__Selector__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1252:1: ( ( ( rule__Selector__Group_1_1_1__0 )* ) )
            // InternalSeleniumScript.g:1253:1: ( ( rule__Selector__Group_1_1_1__0 )* )
            {
            // InternalSeleniumScript.g:1253:1: ( ( rule__Selector__Group_1_1_1__0 )* )
            // InternalSeleniumScript.g:1254:2: ( rule__Selector__Group_1_1_1__0 )*
            {
             before(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 
            // InternalSeleniumScript.g:1255:2: ( rule__Selector__Group_1_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WHITE_SPACE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeleniumScript.g:1255:3: rule__Selector__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Selector__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSeleniumScript.g:1264:1: rule__Selector__Group_1_1_1__0 : rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 ;
    public final void rule__Selector__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1268:1: ( rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 )
            // InternalSeleniumScript.g:1269:2: rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSeleniumScript.g:1276:1: rule__Selector__Group_1_1_1__0__Impl : ( rulePROP_SELECTOR_COMBINATOR ) ;
    public final void rule__Selector__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1280:1: ( ( rulePROP_SELECTOR_COMBINATOR ) )
            // InternalSeleniumScript.g:1281:1: ( rulePROP_SELECTOR_COMBINATOR )
            {
            // InternalSeleniumScript.g:1281:1: ( rulePROP_SELECTOR_COMBINATOR )
            // InternalSeleniumScript.g:1282:2: rulePROP_SELECTOR_COMBINATOR
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
    // InternalSeleniumScript.g:1291:1: rule__Selector__Group_1_1_1__1 : rule__Selector__Group_1_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1295:1: ( rule__Selector__Group_1_1_1__1__Impl )
            // InternalSeleniumScript.g:1296:2: rule__Selector__Group_1_1_1__1__Impl
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
    // InternalSeleniumScript.g:1302:1: rule__Selector__Group_1_1_1__1__Impl : ( ( rule__Selector__PropSelectorsAssignment_1_1_1_1 ) ) ;
    public final void rule__Selector__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1306:1: ( ( ( rule__Selector__PropSelectorsAssignment_1_1_1_1 ) ) )
            // InternalSeleniumScript.g:1307:1: ( ( rule__Selector__PropSelectorsAssignment_1_1_1_1 ) )
            {
            // InternalSeleniumScript.g:1307:1: ( ( rule__Selector__PropSelectorsAssignment_1_1_1_1 ) )
            // InternalSeleniumScript.g:1308:2: ( rule__Selector__PropSelectorsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getPropSelectorsAssignment_1_1_1_1()); 
            // InternalSeleniumScript.g:1309:2: ( rule__Selector__PropSelectorsAssignment_1_1_1_1 )
            // InternalSeleniumScript.g:1309:3: rule__Selector__PropSelectorsAssignment_1_1_1_1
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
    // InternalSeleniumScript.g:1318:1: rule__PropSelector__Group__0 : rule__PropSelector__Group__0__Impl rule__PropSelector__Group__1 ;
    public final void rule__PropSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1322:1: ( rule__PropSelector__Group__0__Impl rule__PropSelector__Group__1 )
            // InternalSeleniumScript.g:1323:2: rule__PropSelector__Group__0__Impl rule__PropSelector__Group__1
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
    // InternalSeleniumScript.g:1330:1: rule__PropSelector__Group__0__Impl : ( ( rule__PropSelector__NameAssignment_0 ) ) ;
    public final void rule__PropSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1334:1: ( ( ( rule__PropSelector__NameAssignment_0 ) ) )
            // InternalSeleniumScript.g:1335:1: ( ( rule__PropSelector__NameAssignment_0 ) )
            {
            // InternalSeleniumScript.g:1335:1: ( ( rule__PropSelector__NameAssignment_0 ) )
            // InternalSeleniumScript.g:1336:2: ( rule__PropSelector__NameAssignment_0 )
            {
             before(grammarAccess.getPropSelectorAccess().getNameAssignment_0()); 
            // InternalSeleniumScript.g:1337:2: ( rule__PropSelector__NameAssignment_0 )
            // InternalSeleniumScript.g:1337:3: rule__PropSelector__NameAssignment_0
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
    // InternalSeleniumScript.g:1345:1: rule__PropSelector__Group__1 : rule__PropSelector__Group__1__Impl rule__PropSelector__Group__2 ;
    public final void rule__PropSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1349:1: ( rule__PropSelector__Group__1__Impl rule__PropSelector__Group__2 )
            // InternalSeleniumScript.g:1350:2: rule__PropSelector__Group__1__Impl rule__PropSelector__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSeleniumScript.g:1357:1: rule__PropSelector__Group__1__Impl : ( RULE_WHITE_SPACE ) ;
    public final void rule__PropSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1361:1: ( ( RULE_WHITE_SPACE ) )
            // InternalSeleniumScript.g:1362:1: ( RULE_WHITE_SPACE )
            {
            // InternalSeleniumScript.g:1362:1: ( RULE_WHITE_SPACE )
            // InternalSeleniumScript.g:1363:2: RULE_WHITE_SPACE
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
    // InternalSeleniumScript.g:1372:1: rule__PropSelector__Group__2 : rule__PropSelector__Group__2__Impl ;
    public final void rule__PropSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1376:1: ( rule__PropSelector__Group__2__Impl )
            // InternalSeleniumScript.g:1377:2: rule__PropSelector__Group__2__Impl
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
    // InternalSeleniumScript.g:1383:1: rule__PropSelector__Group__2__Impl : ( ( rule__PropSelector__ParamAssignment_2 ) ) ;
    public final void rule__PropSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1387:1: ( ( ( rule__PropSelector__ParamAssignment_2 ) ) )
            // InternalSeleniumScript.g:1388:1: ( ( rule__PropSelector__ParamAssignment_2 ) )
            {
            // InternalSeleniumScript.g:1388:1: ( ( rule__PropSelector__ParamAssignment_2 ) )
            // InternalSeleniumScript.g:1389:2: ( rule__PropSelector__ParamAssignment_2 )
            {
             before(grammarAccess.getPropSelectorAccess().getParamAssignment_2()); 
            // InternalSeleniumScript.g:1390:2: ( rule__PropSelector__ParamAssignment_2 )
            // InternalSeleniumScript.g:1390:3: rule__PropSelector__ParamAssignment_2
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
    // InternalSeleniumScript.g:1399:1: rule__Script__FunctionsAssignment_0 : ( ruleFunction ) ;
    public final void rule__Script__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1403:1: ( ( ruleFunction ) )
            // InternalSeleniumScript.g:1404:2: ( ruleFunction )
            {
            // InternalSeleniumScript.g:1404:2: ( ruleFunction )
            // InternalSeleniumScript.g:1405:3: ruleFunction
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
    // InternalSeleniumScript.g:1414:1: rule__Script__FunctionsAssignment_1_1 : ( ruleFunction ) ;
    public final void rule__Script__FunctionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1418:1: ( ( ruleFunction ) )
            // InternalSeleniumScript.g:1419:2: ( ruleFunction )
            {
            // InternalSeleniumScript.g:1419:2: ( ruleFunction )
            // InternalSeleniumScript.g:1420:3: ruleFunction
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
    // InternalSeleniumScript.g:1429:1: rule__Function__NameAssignment_0 : ( ruleFun ) ;
    public final void rule__Function__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1433:1: ( ( ruleFun ) )
            // InternalSeleniumScript.g:1434:2: ( ruleFun )
            {
            // InternalSeleniumScript.g:1434:2: ( ruleFun )
            // InternalSeleniumScript.g:1435:3: ruleFun
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
    // InternalSeleniumScript.g:1444:1: rule__Function__ParamsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Function__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1448:1: ( ( ruleExpression ) )
            // InternalSeleniumScript.g:1449:2: ( ruleExpression )
            {
            // InternalSeleniumScript.g:1449:2: ( ruleExpression )
            // InternalSeleniumScript.g:1450:3: ruleExpression
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
    // InternalSeleniumScript.g:1459:1: rule__Selectors__SelectorsAssignment_1_0_1 : ( ruleSelector ) ;
    public final void rule__Selectors__SelectorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1463:1: ( ( ruleSelector ) )
            // InternalSeleniumScript.g:1464:2: ( ruleSelector )
            {
            // InternalSeleniumScript.g:1464:2: ( ruleSelector )
            // InternalSeleniumScript.g:1465:3: ruleSelector
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
    // InternalSeleniumScript.g:1474:1: rule__Selectors__SelectorsAssignment_1_0_3_1 : ( ruleSelector ) ;
    public final void rule__Selectors__SelectorsAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1478:1: ( ( ruleSelector ) )
            // InternalSeleniumScript.g:1479:2: ( ruleSelector )
            {
            // InternalSeleniumScript.g:1479:2: ( ruleSelector )
            // InternalSeleniumScript.g:1480:3: ruleSelector
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
    // InternalSeleniumScript.g:1489:1: rule__Selectors__SelectorsAssignment_1_1 : ( ruleSelector ) ;
    public final void rule__Selectors__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1493:1: ( ( ruleSelector ) )
            // InternalSeleniumScript.g:1494:2: ( ruleSelector )
            {
            // InternalSeleniumScript.g:1494:2: ( ruleSelector )
            // InternalSeleniumScript.g:1495:3: ruleSelector
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
    // InternalSeleniumScript.g:1504:1: rule__Selector__NameAssignment_0 : ( ruleElem ) ;
    public final void rule__Selector__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1508:1: ( ( ruleElem ) )
            // InternalSeleniumScript.g:1509:2: ( ruleElem )
            {
            // InternalSeleniumScript.g:1509:2: ( ruleElem )
            // InternalSeleniumScript.g:1510:3: ruleElem
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


    // $ANTLR start "rule__Selector__PropSelectorsAssignment_1_1_0"
    // InternalSeleniumScript.g:1519:1: rule__Selector__PropSelectorsAssignment_1_1_0 : ( rulePropSelector ) ;
    public final void rule__Selector__PropSelectorsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1523:1: ( ( rulePropSelector ) )
            // InternalSeleniumScript.g:1524:2: ( rulePropSelector )
            {
            // InternalSeleniumScript.g:1524:2: ( rulePropSelector )
            // InternalSeleniumScript.g:1525:3: rulePropSelector
            {
             before(grammarAccess.getSelectorAccess().getPropSelectorsPropSelectorParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropSelector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getPropSelectorsPropSelectorParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__Selector__PropSelectorsAssignment_1_1_0"


    // $ANTLR start "rule__Selector__PropSelectorsAssignment_1_1_1_1"
    // InternalSeleniumScript.g:1534:1: rule__Selector__PropSelectorsAssignment_1_1_1_1 : ( rulePropSelector ) ;
    public final void rule__Selector__PropSelectorsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1538:1: ( ( rulePropSelector ) )
            // InternalSeleniumScript.g:1539:2: ( rulePropSelector )
            {
            // InternalSeleniumScript.g:1539:2: ( rulePropSelector )
            // InternalSeleniumScript.g:1540:3: rulePropSelector
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
    // InternalSeleniumScript.g:1549:1: rule__PropSelector__NameAssignment_0 : ( ruleProp ) ;
    public final void rule__PropSelector__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1553:1: ( ( ruleProp ) )
            // InternalSeleniumScript.g:1554:2: ( ruleProp )
            {
            // InternalSeleniumScript.g:1554:2: ( ruleProp )
            // InternalSeleniumScript.g:1555:3: ruleProp
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
    // InternalSeleniumScript.g:1564:1: rule__PropSelector__ParamAssignment_2 : ( rulePrimary ) ;
    public final void rule__PropSelector__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1568:1: ( ( rulePrimary ) )
            // InternalSeleniumScript.g:1569:2: ( rulePrimary )
            {
            // InternalSeleniumScript.g:1569:2: ( rulePrimary )
            // InternalSeleniumScript.g:1570:3: rulePrimary
            {
             before(grammarAccess.getPropSelectorAccess().getParamPrimaryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPropSelectorAccess().getParamPrimaryParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalSeleniumScript.g:1579:1: rule__StringValue__ValueAssignment : ( ( rule__StringValue__ValueAlternatives_0 ) ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1583:1: ( ( ( rule__StringValue__ValueAlternatives_0 ) ) )
            // InternalSeleniumScript.g:1584:2: ( ( rule__StringValue__ValueAlternatives_0 ) )
            {
            // InternalSeleniumScript.g:1584:2: ( ( rule__StringValue__ValueAlternatives_0 ) )
            // InternalSeleniumScript.g:1585:3: ( rule__StringValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getStringValueAccess().getValueAlternatives_0()); 
            // InternalSeleniumScript.g:1586:3: ( rule__StringValue__ValueAlternatives_0 )
            // InternalSeleniumScript.g:1586:4: rule__StringValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAlternatives_0()); 

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
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // InternalSeleniumScript.g:1594:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1598:1: ( ( RULE_INT ) )
            // InternalSeleniumScript.g:1599:2: ( RULE_INT )
            {
            // InternalSeleniumScript.g:1599:2: ( RULE_INT )
            // InternalSeleniumScript.g:1600:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000260L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000087C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007800000L});

}
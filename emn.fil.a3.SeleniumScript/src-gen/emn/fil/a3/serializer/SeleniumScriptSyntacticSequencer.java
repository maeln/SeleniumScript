/*
 * generated by Xtext 2.10.0
 */
package emn.fil.a3.serializer;

import com.google.inject.Inject;
import emn.fil.a3.services.SeleniumScriptGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SeleniumScriptSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SeleniumScriptGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Script_WSTerminalRuleCall_2_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SeleniumScriptGrammarAccess) access;
		match_Script_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getScriptAccess().getWSTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getEND_OF_LINERule())
			return getEND_OF_LINEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPRIMARYRule())
			return getPRIMARYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPROP_SELECTOR_COMBINATORRule())
			return getPROP_SELECTOR_COMBINATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSELECTOR_COMBINATORRule())
			return getSELECTOR_COMBINATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSEPARATORRule())
			return getSEPARATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWHITE_SPACERule())
			return getWHITE_SPACEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal END_OF_LINE: WHITE_SPACE "\n" WHITE_SPACE;
	 */
	protected String getEND_OF_LINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * PRIMARY:
	 * 	STRING | ID | INT
	 * ;
	 */
	protected String getPRIMARYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * PROP_SELECTOR_COMBINATOR: WHITE_SPACE;
	 */
	protected String getPROP_SELECTOR_COMBINATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * SELECTOR_COMBINATOR: '.';
	 */
	protected String getSELECTOR_COMBINATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * SEPARATOR: WHITE_SPACE;
	 */
	protected String getSEPARATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal WHITE_SPACE: (' '|'\t'|'\r')*;
	 */
	protected String getWHITE_SPACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal WS			: (' '|'\t'|'\r'|'\n')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Script_WSTerminalRuleCall_2_a.equals(syntax))
				emit_Script_WSTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     WS*
	 *
	 * This ambiguous syntax occurs at:
	 *     functions+=Function (ambiguity) (rule end)
	 */
	protected void emit_Script_WSTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
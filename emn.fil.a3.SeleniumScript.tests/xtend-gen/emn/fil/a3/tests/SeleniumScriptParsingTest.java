/**
 * generated by Xtext 2.10.0
 */
package emn.fil.a3.tests;

import com.google.inject.Inject;
import emn.fil.a3.seleniumScript.Script;
import emn.fil.a3.tests.SeleniumScriptInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SeleniumScriptInjectorProvider.class)
@SuppressWarnings("all")
public class SeleniumScriptParsingTest {
  @Inject
  private ParseHelper<Script> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Script result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
/**
 * generated by Xtext 2.10.0
 */
package emn.fil.a3.generator;

import com.google.common.collect.Iterables;
import emn.fil.a3.seleniumScript.Function;
import emn.fil.a3.seleniumScript.Script;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SeleniumScriptGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = resource.getContents();
    Iterable<Script> _filter = Iterables.<Script>filter(_contents, Script.class);
    Script _head = IterableExtensions.<Script>head(_filter);
    CharSequence _genSeleniumcript = this.genSeleniumcript(_head);
    fsa.generateFile("SeleniumTest.java", _genSeleniumcript);
  }
  
  public CharSequence genSeleniumcript(final Script script) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class Script {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void openBrowser() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Function> _functions = script.getFunctions();
      for(final Function f : _functions) {
        _builder.append("boolean ");
        String _name = f.getName();
        _builder.append(_name, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

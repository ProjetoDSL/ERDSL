package org.xtext.unipampa.erdsl.generator;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.unipampa.erdsl.erDsl.ERModel;

@SuppressWarnings("all")
public class OcurrenceDiagramGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = input.getContents().get(0);
    final ERModel modeloER = ((ERModel) _get);
    try {
      String _lowerCase = modeloER.getDomain().getName().toLowerCase();
      String _plus = (_lowerCase + "_OcurrenceDiagram.sql");
      fsa.generateFile(_plus, this.ocurrence_CreateDiagram(modeloER));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        InputOutput.<String>println(((List<StackTraceElement>)Conversions.doWrapArray(e.getStackTrace())).toString());
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private CharSequence ocurrence_CreateDiagram(final ERModel modeloER) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test");
    _builder.newLine();
    return _builder;
  }
}

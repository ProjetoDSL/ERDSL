package org.xtext.unipampa.erdsl.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.unipampa.erdsl.erDsl.Attribute;
import org.xtext.unipampa.erdsl.erDsl.ERModel;
import org.xtext.unipampa.erdsl.erDsl.Entity;
import org.xtext.unipampa.erdsl.erDsl.Relation;

@SuppressWarnings("all")
public class HtmlFileGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = input.getContents().get(0);
    final ERModel modeloER = ((ERModel) _get);
    try {
      String _lowerCase = modeloER.getDomain().getName().toLowerCase();
      String _plus = (_lowerCase + "_Logical.html");
      fsa.generateFile(_plus, this.CreateLogical(modeloER));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        InputOutput.<String>println(((List<StackTraceElement>)Conversions.doWrapArray(e.getStackTrace())).toString());
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private CharSequence CreateLogical(final ERModel modeloER) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _html_Head = this.html_Head();
    _builder.append(_html_Head);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _html_DomainMapping = this.html_DomainMapping(modeloER);
    _builder.append(_html_DomainMapping);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _html_EntitiesMapping = this.html_EntitiesMapping(modeloER);
    _builder.append(_html_EntitiesMapping);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _html_RelationshipsMapping = this.html_RelationshipsMapping(modeloER);
    _builder.append(_html_RelationshipsMapping);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _html_Footer = this.html_Footer();
    _builder.append(_html_Footer);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence html_Head() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>ERtext Logical schema</title>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("body {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("background: #ffffff;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("border: 1px solid black, padding: 5px 0 5px 0");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append(".title {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("font: bold 160% serif;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("color: #0066FF;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("padding: 10px 0 10px 0;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("text-align: center;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("background: #ccc8c8");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append(".stitle {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("font: bold 120% sans-serif;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("color: #0044DD;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("padding: 10px 0 10px 0");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append(".sstitle {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("font: bold 120% serif;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("color: #000000;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("background: #efefef;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("padding: 5px 0 5px 0;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("padding-left: 20px;");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append(".field {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("font: 100% sans-serif;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("color: #000000;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("padding: 2px;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("padding-left: 50px;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("border: 0px solid black");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append(".value {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("font: 100% sans-serif;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("color: #505050");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("footer {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("text-align: center;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("padding: 3px;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("border: 1px;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("background-color: #ccc8c8;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("color: white;");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"panel\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<p class=\"title badge-primary\">LOGICAL SCHEMA</p>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>\t\t");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence html_Footer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<footer>");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("<p><a href=\"https://github.com/ProjetoDSL/ERDSL\">github.com/ProjetoDSL/ERDSL</a></p>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</footer>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Display of the modeled domain (database name)
   */
  private CharSequence html_DomainMapping(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p class=\"sstitle\">");
    _builder.newLine();
    _builder.append("<a href=\"#domain\" class=\"btn btn-primary\" data-toggle=\"collapse\"><i class=\"fa fa-arrows-v\" aria-hidden=\"true\"></i></a>");
    _builder.newLine();
    _builder.append("&nbsp; Domain");
    _builder.newLine();
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<div id=\"domain\" class=\"panel-body collapse in\">");
    _builder.newLine();
    _builder.append("<p class=\"field\"><span class=\"label label-pill label-primary\">");
    String _upperCase = m.getDomain().getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("</span></p>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>\t");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Display of modeled entities (tables)
   */
  private CharSequence html_EntitiesMapping(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<hr style=\"width:100%;text-align:left;margin-left:0\">");
    _builder.newLine();
    _builder.append("<p class=\"sstitle\">");
    _builder.newLine();
    _builder.append("<a href=\"#entities\" class=\"btn btn-primary\" data-toggle=\"collapse\"><i class=\"fa fa-arrows-v\" aria-hidden=\"true\"></i></a>");
    _builder.newLine();
    _builder.append("&nbsp; Entities");
    _builder.newLine();
    _builder.append("</p>\t ");
    _builder.newLine();
    _builder.append("<div id=\"entities\" class=\"panel-body collapse in\">");
    _builder.newLine();
    _builder.append("<p class=\"field\">");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Entity> _entities = m.getEntities();
      boolean _hasElements = false;
      for(final Entity entity : _entities) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ]<br/><br/>", "\t");
        }
        _builder.append("\t");
        CharSequence _html_EntityNameTag = this.html_EntityNameTag(entity.getName());
        _builder.append(_html_EntityNameTag, "\t");
        _builder.append(" [ ");
        CharSequence _html_AttributesMapping = this.html_AttributesMapping(m, entity);
        _builder.append(_html_AttributesMapping, "\t");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("]<br/>", "\t");
      }
    }
    _builder.newLine();
    CharSequence _html_NtoN_EntityCreation = this.html_NtoN_EntityCreation(m);
    _builder.append(_html_NtoN_EntityCreation);
    _builder.newLineIfNotEmpty();
    CharSequence _html_Ternary_EntityCreation = this.html_Ternary_EntityCreation(m);
    _builder.append(_html_Ternary_EntityCreation);
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence html_EntityNameTag(final String o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<span class=\"label label-pill label-primary\">");
    String _upperCase = o.toUpperCase();
    _builder.append(_upperCase);
    _builder.append("</span>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Verification and display of primary (PK) and, at the same time, foreign (FK)
   * keys from generalizations / specializations:
   *  1) Checks for a reference to a parent entity;
   *  2) If it exists, the key that references the parent is written being primary and foreign at the same time
   * @param e The analyzed entity.
   */
  private CharSequence html_AttributesMapping(final ERModel m, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    boolean hasPK = false;
    _builder.newLineIfNotEmpty();
    {
      final Function1<Attribute, Boolean> _function = (Attribute it) -> {
        return Boolean.valueOf(it.isIsKey());
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(e.getAttributes(), _function);
      boolean _hasElements = false;
      for(final Attribute att : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" | ", "");
        }
        CharSequence _html_AttributeStyleForPK = this.html_AttributeStyleForPK(att);
        _builder.append(_html_AttributeStyleForPK);
        _builder.newLineIfNotEmpty();
        Object _xblockexpression = null;
        {
          hasPK = true;
          _xblockexpression = null;
        }
        _builder.append(_xblockexpression);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
        boolean _isIsKey = it.isIsKey();
        return Boolean.valueOf((!_isIsKey));
      };
      Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(e.getAttributes(), _function_1);
      boolean _hasElements_1 = false;
      for(final Attribute att_1 : _filter_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          String _xifexpression = null;
          if (hasPK) {
            _xifexpression = " | ";
          }
          _builder.append(_xifexpression);
        } else {
          _builder.appendImmediate(" | ", "");
        }
        String _name = att_1.getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
      }
    }
    Object _xblockexpression_1 = null;
    {
      hasPK = false;
      _xblockexpression_1 = null;
    }
    _builder.append(_xblockexpression_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Entity _is = e.getIs();
      boolean _tripleNotEquals = (_is != null);
      if (_tripleNotEquals) {
        {
          final Function1<Attribute, Boolean> _function_2 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_2 = IterableExtensions.<Attribute>filter(e.getIs().getAttributes(), _function_2);
          boolean _hasElements_2 = false;
          for(final Attribute PKInherited : _filter_2) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
              _builder.append(" | ");
            } else {
              _builder.appendImmediate(" | ", "");
            }
            CharSequence _html_AttributeStyleForInheritedPK = this.html_AttributeStyleForInheritedPK(PKInherited);
            _builder.append(_html_AttributeStyleForInheritedPK);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    CharSequence _html_1To1_RefCheck = this.html_1To1_RefCheck(m, e);
    _builder.append(_html_1To1_RefCheck);
    _builder.newLineIfNotEmpty();
    CharSequence _html_1ToN_RefCheck = this.html_1ToN_RefCheck(m, e);
    _builder.append(_html_1ToN_RefCheck);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence html_AttributeStyleForPK(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<font color=\"red\"><i class=\"fa fa-key\" aria-hidden=\"true\"></i></font> ");
    String _lowerCase = a.getName().toLowerCase();
    _builder.append(_lowerCase);
    return _builder;
  }
  
  private CharSequence html_AttributeStyleForInheritedPK(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<font color=\"red\"><i class=\"fa fa-key\" aria-hidden=\"true\"></i></font><font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font> ");
    String _lowerCase = a.getName().toLowerCase();
    _builder.append(_lowerCase);
    return _builder;
  }
  
  private CharSequence html_AttributeStyleForInheritedPK(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<Attribute, Boolean> _function = (Attribute it) -> {
        return Boolean.valueOf(it.isIsKey());
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(e.getAttributes(), _function);
      boolean _hasElements = false;
      for(final Attribute attribute : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" | ", "");
        }
        _builder.append("<font color=\"red\"><i class=\"fa fa-key\" aria-hidden=\"true\"></i></font><font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font> ");
        String _lowerCase = attribute.getName().toLowerCase();
        _builder.append(_lowerCase);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence html_AttributeStyleForFK(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font> ");
    String _lowerCase = a.getName().toLowerCase();
    _builder.append(_lowerCase);
    return _builder;
  }
  
  private CharSequence html_1To1_RefCheck(final ERModel m, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Relation> _relations = m.getRelations();
      for(final Relation relation : _relations) {
        {
          if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:1)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:1)")))) {
            {
              boolean _equalsIgnoreCase = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(e.getName());
              if (_equalsIgnoreCase) {
                {
                  EList<Entity> _entities = m.getEntities();
                  for(final Entity aux : _entities) {
                    {
                      boolean _equalsIgnoreCase_1 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(aux.getName());
                      if (_equalsIgnoreCase_1) {
                        {
                          Entity _is = aux.getIs();
                          boolean _tripleEquals = (_is == null);
                          if (_tripleEquals) {
                            {
                              boolean _equalsIgnoreCase_2 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                              boolean _not = (!_equalsIgnoreCase_2);
                              if (_not) {
                                {
                                  final Function1<Attribute, Boolean> _function = (Attribute it) -> {
                                    return Boolean.valueOf(it.isIsKey());
                                  };
                                  Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(aux.getAttributes(), _function);
                                  boolean _hasElements = false;
                                  for(final Attribute aux2 : _filter) {
                                    if (!_hasElements) {
                                      _hasElements = true;
                                      _builder.append(" | ");
                                    } else {
                                      _builder.appendImmediate(" | ", "");
                                    }
                                    CharSequence _html_AttributeStyleForFK = this.html_AttributeStyleForFK(aux2);
                                    _builder.append(_html_AttributeStyleForFK);
                                    _builder.append("_fk");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              } else {
                                CharSequence _html_ListPKtoFK_SelfRelationship = this.html_ListPKtoFK_SelfRelationship(aux, relation.getName().toLowerCase());
                                _builder.append(_html_ListPKtoFK_SelfRelationship);
                                _builder.newLineIfNotEmpty();
                              }
                            }
                            _builder.append("\t\t\t\t\t\t\t");
                            _builder.newLine();
                            _builder.newLine();
                            _builder.append("\t\t\t\t\t\t\t");
                            _builder.newLine();
                          } else {
                            Entity _is_1 = aux.getIs();
                            boolean _tripleNotEquals = (_is_1 != null);
                            if (_tripleNotEquals) {
                              {
                                final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
                                  return Boolean.valueOf(it.isIsKey());
                                };
                                Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(aux.getIs().getAttributes(), _function_1);
                                boolean _hasElements_1 = false;
                                for(final Attribute aux3 : _filter_1) {
                                  if (!_hasElements_1) {
                                    _hasElements_1 = true;
                                    _builder.append(" | ");
                                  } else {
                                    _builder.appendImmediate(" | ", "");
                                  }
                                  {
                                    boolean _equalsIgnoreCase_3 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                                    boolean _not_1 = (!_equalsIgnoreCase_3);
                                    if (_not_1) {
                                      CharSequence _html_AttributeStyleForFK_1 = this.html_AttributeStyleForFK(aux3);
                                      _builder.append(_html_AttributeStyleForFK_1);
                                      _builder.append("_fk");
                                      _builder.newLineIfNotEmpty();
                                    } else {
                                      CharSequence _html_AttributeStyleForFK_2 = this.html_AttributeStyleForFK(aux3);
                                      String _plus = (_html_AttributeStyleForFK_2 + "_");
                                      String _lowerCase = relation.getName().toLowerCase();
                                      String _plus_1 = (_plus + _lowerCase);
                                      _builder.append(_plus_1);
                                      _builder.append("_fk");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_1ToN_RefCheck(final ERModel m, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    Entity temp = null;
    _builder.newLineIfNotEmpty();
    {
      EList<Relation> _relations = m.getRelations();
      for(final Relation relation : _relations) {
        {
          if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:1)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:N)")))) {
            _builder.newLine();
            {
              boolean _equalsIgnoreCase = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(e.getName());
              if (_equalsIgnoreCase) {
                {
                  EList<Entity> _entities = m.getEntities();
                  for(final Entity aux : _entities) {
                    {
                      boolean _equalsIgnoreCase_1 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(aux.getName());
                      if (_equalsIgnoreCase_1) {
                        {
                          Entity _is = aux.getIs();
                          boolean _tripleEquals = (_is == null);
                          if (_tripleEquals) {
                            {
                              boolean _equalsIgnoreCase_2 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                              boolean _not = (!_equalsIgnoreCase_2);
                              if (_not) {
                                CharSequence _html_ListPKtoFK = this.html_ListPKtoFK(aux);
                                _builder.append(_html_ListPKtoFK);
                                _builder.newLineIfNotEmpty();
                              } else {
                                boolean _equalsIgnoreCase_3 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                                if (_equalsIgnoreCase_3) {
                                  CharSequence _html_ListPKtoFK_SelfRelationship = this.html_ListPKtoFK_SelfRelationship(aux, relation.getName().toLowerCase());
                                  _builder.append(_html_ListPKtoFK_SelfRelationship);
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            }
                          } else {
                            Entity _is_1 = aux.getIs();
                            boolean _tripleNotEquals = (_is_1 != null);
                            if (_tripleNotEquals) {
                              {
                                boolean _equalsIgnoreCase_4 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                                if (_equalsIgnoreCase_4) {
                                  CharSequence _html_ListPKtoFK_SelfRelationship_1 = this.html_ListPKtoFK_SelfRelationship(aux, relation.getName().toLowerCase());
                                  _builder.append(_html_ListPKtoFK_SelfRelationship_1);
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  boolean _equalsIgnoreCase_5 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                                  boolean _not_1 = (!_equalsIgnoreCase_5);
                                  if (_not_1) {
                                    Object _xblockexpression = null;
                                    {
                                      EObject _target = relation.getLeftEnding().getTarget();
                                      temp = ((Entity) _target);
                                      _xblockexpression = null;
                                    }
                                    _builder.append(_xblockexpression);
                                    _builder.newLineIfNotEmpty();
                                    CharSequence _html_ListPKtoFK_1 = this.html_ListPKtoFK(temp.getIs());
                                    _builder.append(_html_ListPKtoFK_1);
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:N)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:1)")))) {
              _builder.newLine();
              {
                boolean _equalsIgnoreCase_6 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(e.getName());
                if (_equalsIgnoreCase_6) {
                  {
                    EList<Entity> _entities_1 = m.getEntities();
                    for(final Entity aux_1 : _entities_1) {
                      {
                        boolean _equalsIgnoreCase_7 = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(aux_1.getName());
                        if (_equalsIgnoreCase_7) {
                          {
                            Entity _is_2 = aux_1.getIs();
                            boolean _tripleEquals_1 = (_is_2 == null);
                            if (_tripleEquals_1) {
                              {
                                boolean _equalsIgnoreCase_8 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                                boolean _not_2 = (!_equalsIgnoreCase_8);
                                if (_not_2) {
                                  CharSequence _html_ListPKtoFK_2 = this.html_ListPKtoFK(aux_1);
                                  _builder.append(_html_ListPKtoFK_2);
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  CharSequence _html_ListPKtoFK_SelfRelationship_2 = this.html_ListPKtoFK_SelfRelationship(aux_1, relation.getName().toLowerCase());
                                  _builder.append(_html_ListPKtoFK_SelfRelationship_2);
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            } else {
                              Entity _is_3 = aux_1.getIs();
                              boolean _tripleNotEquals_1 = (_is_3 != null);
                              if (_tripleNotEquals_1) {
                                {
                                  boolean _equalsIgnoreCase_9 = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(relation.getLeftEnding().getTarget().toString());
                                  if (_equalsIgnoreCase_9) {
                                    _builder.newLine();
                                    _builder.newLine();
                                    _builder.newLine();
                                    CharSequence _html_ListPKtoFK_SelfRelationship_3 = this.html_ListPKtoFK_SelfRelationship(aux_1, relation.getName().toLowerCase());
                                    _builder.append(_html_ListPKtoFK_SelfRelationship_3);
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    boolean _equalsIgnoreCase_10 = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(relation.getLeftEnding().getTarget().toString());
                                    boolean _not_3 = (!_equalsIgnoreCase_10);
                                    if (_not_3) {
                                      Object _xblockexpression_1 = null;
                                      {
                                        EObject _target = relation.getRightEnding().getTarget();
                                        temp = ((Entity) _target);
                                        _xblockexpression_1 = null;
                                      }
                                      _builder.append(_xblockexpression_1);
                                      _builder.newLineIfNotEmpty();
                                      CharSequence _html_ListPKtoFK_3 = this.html_ListPKtoFK(temp.getIs());
                                      _builder.append(_html_ListPKtoFK_3);
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Formation of entities from relations N:N.
   * 	1) Checks if there is a name for the relationship, if it does not exist, the name of the two associated entities is concatenated;
   *  2) The primary keys of the associated entities are allocated and become primary and foreign at the same time;
   *  3) If the relationship has attributes they are written at the end
   * @param m The analyzed model.
   */
  private CharSequence html_NtoN_EntityCreation(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Relation> _relations = m.getRelations();
      for(final Relation relation : _relations) {
        {
          if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:N)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:N)")))) {
            {
              if (((relation.getLeftEnding().getTarget() instanceof Entity) && (relation.getRightEnding().getTarget() instanceof Entity))) {
                _builder.newLine();
                {
                  boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(relation.getName());
                  if (_isNullOrEmpty) {
                    _builder.append("<br/>");
                    String _upperCase = relation.getLeftEnding().getTarget().toString().toUpperCase();
                    String _plus = (_upperCase + "_");
                    String _upperCase_1 = relation.getRightEnding().getTarget().toString().toUpperCase();
                    String _plus_1 = (_plus + _upperCase_1);
                    CharSequence _html_EntityNameTag = this.html_EntityNameTag(_plus_1);
                    _builder.append(_html_EntityNameTag);
                    _builder.append(" [");
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(relation.getName());
                    boolean _not = (!_isNullOrEmpty_1);
                    if (_not) {
                      _builder.append("<br/>");
                      CharSequence _html_EntityNameTag_1 = this.html_EntityNameTag(relation.getName());
                      _builder.append(_html_EntityNameTag_1);
                      _builder.append(" [");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
                _builder.newLine();
                {
                  EList<Entity> _entities = m.getEntities();
                  for(final Entity entity : _entities) {
                    {
                      if ((relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(entity.getName()) && (!relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString())))) {
                        {
                          Entity _is = entity.getIs();
                          boolean _tripleNotEquals = (_is != null);
                          if (_tripleNotEquals) {
                            {
                              final Function1<Attribute, Boolean> _function = (Attribute it) -> {
                                return Boolean.valueOf(it.isIsKey());
                              };
                              Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(entity.getIs().getAttributes(), _function);
                              boolean _hasElements = false;
                              for(final Attribute attribute : _filter) {
                                if (!_hasElements) {
                                  _hasElements = true;
                                } else {
                                  _builder.appendImmediate(" | ", "");
                                }
                                CharSequence _html_AttributeStyleForInheritedPK = this.html_AttributeStyleForInheritedPK(attribute);
                                _builder.append(_html_AttributeStyleForInheritedPK);
                                _builder.append("_fk");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          } else {
                            {
                              final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
                                return Boolean.valueOf(it.isIsKey());
                              };
                              Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(entity.getAttributes(), _function_1);
                              boolean _hasElements_1 = false;
                              for(final Attribute attribute_1 : _filter_1) {
                                if (!_hasElements_1) {
                                  _hasElements_1 = true;
                                } else {
                                  _builder.appendImmediate(" | ", "");
                                }
                                CharSequence _html_AttributeStyleForInheritedPK_1 = this.html_AttributeStyleForInheritedPK(attribute_1);
                                _builder.append(_html_AttributeStyleForInheritedPK_1);
                                _builder.append("_fk");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                        _builder.newLine();
                      }
                    }
                  }
                }
                _builder.newLine();
                {
                  EList<Entity> _entities_1 = m.getEntities();
                  for(final Entity entity_1 : _entities_1) {
                    {
                      if ((relation.getRightEnding().getTarget().toString().equalsIgnoreCase(entity_1.getName()) && (!relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString())))) {
                        {
                          final Function1<Attribute, Boolean> _function_2 = (Attribute it) -> {
                            return Boolean.valueOf(it.isIsKey());
                          };
                          Iterable<Attribute> _filter_2 = IterableExtensions.<Attribute>filter(entity_1.getAttributes(), _function_2);
                          boolean _hasElements_2 = false;
                          for(final Attribute attribute_2 : _filter_2) {
                            if (!_hasElements_2) {
                              _hasElements_2 = true;
                              _builder.append(" | ");
                            } else {
                              _builder.appendImmediate(" | ", "");
                            }
                            CharSequence _html_AttributeStyleForInheritedPK_2 = this.html_AttributeStyleForInheritedPK(attribute_2);
                            _builder.append(_html_AttributeStyleForInheritedPK_2);
                            _builder.append("_fk");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
                _builder.newLine();
                {
                  EList<Entity> _entities_2 = m.getEntities();
                  for(final Entity entity_2 : _entities_2) {
                    _builder.append("\t\t\t\t");
                    _builder.newLine();
                    {
                      if ((relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(entity_2.getName()) && relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString()))) {
                        {
                          Entity _is_1 = entity_2.getIs();
                          boolean _tripleNotEquals_1 = (_is_1 != null);
                          if (_tripleNotEquals_1) {
                            {
                              final Function1<Attribute, Boolean> _function_3 = (Attribute it) -> {
                                return Boolean.valueOf(it.isIsKey());
                              };
                              Iterable<Attribute> _filter_3 = IterableExtensions.<Attribute>filter(entity_2.getIs().getAttributes(), _function_3);
                              boolean _hasElements_3 = false;
                              for(final Attribute attribute_3 : _filter_3) {
                                if (!_hasElements_3) {
                                  _hasElements_3 = true;
                                } else {
                                  _builder.appendImmediate(" | ", "");
                                }
                                CharSequence _html_AttributeStyleForInheritedPK_3 = this.html_AttributeStyleForInheritedPK(attribute_3);
                                _builder.append(_html_AttributeStyleForInheritedPK_3);
                                _builder.append("_fk_1 ");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          } else {
                            {
                              final Function1<Attribute, Boolean> _function_4 = (Attribute it) -> {
                                return Boolean.valueOf(it.isIsKey());
                              };
                              Iterable<Attribute> _filter_4 = IterableExtensions.<Attribute>filter(entity_2.getAttributes(), _function_4);
                              boolean _hasElements_4 = false;
                              for(final Attribute attribute_4 : _filter_4) {
                                if (!_hasElements_4) {
                                  _hasElements_4 = true;
                                } else {
                                  _builder.appendImmediate(" | ", "");
                                }
                                CharSequence _html_AttributeStyleForInheritedPK_4 = this.html_AttributeStyleForInheritedPK(attribute_4);
                                _builder.append(_html_AttributeStyleForInheritedPK_4);
                                _builder.append("_fk_1 ");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                    }
                    _builder.newLine();
                    {
                      if ((relation.getRightEnding().getTarget().toString().equalsIgnoreCase(entity_2.getName()) && relation.getRightEnding().getTarget().toString().equalsIgnoreCase(relation.getLeftEnding().getTarget().toString()))) {
                        {
                          Entity _is_2 = entity_2.getIs();
                          boolean _tripleNotEquals_2 = (_is_2 != null);
                          if (_tripleNotEquals_2) {
                            {
                              final Function1<Attribute, Boolean> _function_5 = (Attribute it) -> {
                                return Boolean.valueOf(it.isIsKey());
                              };
                              Iterable<Attribute> _filter_5 = IterableExtensions.<Attribute>filter(entity_2.getIs().getAttributes(), _function_5);
                              boolean _hasElements_5 = false;
                              for(final Attribute attribute_5 : _filter_5) {
                                if (!_hasElements_5) {
                                  _hasElements_5 = true;
                                  _builder.append(" | ");
                                } else {
                                  _builder.appendImmediate(" | ", "");
                                }
                                CharSequence _html_AttributeStyleForInheritedPK_5 = this.html_AttributeStyleForInheritedPK(attribute_5);
                                _builder.append(_html_AttributeStyleForInheritedPK_5);
                                _builder.append("_fk_2");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          } else {
                            {
                              final Function1<Attribute, Boolean> _function_6 = (Attribute it) -> {
                                return Boolean.valueOf(it.isIsKey());
                              };
                              Iterable<Attribute> _filter_6 = IterableExtensions.<Attribute>filter(entity_2.getAttributes(), _function_6);
                              boolean _hasElements_6 = false;
                              for(final Attribute attribute_6 : _filter_6) {
                                if (!_hasElements_6) {
                                  _hasElements_6 = true;
                                  _builder.append(" | ");
                                } else {
                                  _builder.appendImmediate(" | ", "");
                                }
                                CharSequence _html_AttributeStyleForInheritedPK_6 = this.html_AttributeStyleForInheritedPK(attribute_6);
                                _builder.append(_html_AttributeStyleForInheritedPK_6);
                                _builder.append("_fk_2");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                _builder.newLine();
                _builder.append("\t\t\t");
                _builder.newLine();
                {
                  final Function1<Attribute, Boolean> _function_7 = (Attribute i) -> {
                    return Boolean.valueOf(((!StringExtensions.isNullOrEmpty(i.getName())) && i.isIsKey()));
                  };
                  Iterable<Attribute> _filter_7 = IterableExtensions.<Attribute>filter(relation.getAttributes(), _function_7);
                  boolean _hasElements_7 = false;
                  for(final Attribute attribute_7 : _filter_7) {
                    if (!_hasElements_7) {
                      _hasElements_7 = true;
                      _builder.append(" | ");
                    } else {
                      _builder.appendImmediate(" | ", "");
                    }
                    CharSequence _html_AttributeStyleForPK = this.html_AttributeStyleForPK(attribute_7);
                    _builder.append(_html_AttributeStyleForPK);
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  final Function1<Attribute, Boolean> _function_8 = (Attribute i) -> {
                    return Boolean.valueOf(((!StringExtensions.isNullOrEmpty(i.getName())) && (!i.isIsKey())));
                  };
                  Iterable<Attribute> _filter_8 = IterableExtensions.<Attribute>filter(relation.getAttributes(), _function_8);
                  boolean _hasElements_8 = false;
                  for(final Attribute attribute_8 : _filter_8) {
                    if (!_hasElements_8) {
                      _hasElements_8 = true;
                      _builder.append(" | ");
                    } else {
                      _builder.appendImmediate(" | ", "");
                    }
                    String _lowerCase = attribute_8.getName().toLowerCase();
                    _builder.append(_lowerCase);
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("]<br/>\t");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_Ternary_EntityCreation(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    Relation tempRel = null;
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    {
      final Function1<Relation, Boolean> _function = (Relation i) -> {
        return Boolean.valueOf(((i.getLeftEnding().getTarget() instanceof Relation) || (i.getRightEnding().getTarget() instanceof Relation)));
      };
      Iterable<Relation> _filter = IterableExtensions.<Relation>filter(m.getRelations(), _function);
      boolean _hasElements = false;
      for(final Relation relation : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("] <br/>", "");
        }
        _builder.newLine();
        {
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(relation.getName());
          if (_isNullOrEmpty) {
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<br/>");
            String _upperCase = relation.getLeftEnding().getTarget().toString().toUpperCase();
            String _plus = (_upperCase + "_");
            String _upperCase_1 = relation.getRightEnding().getTarget().toString().toUpperCase();
            String _plus_1 = (_plus + _upperCase_1);
            CharSequence _html_EntityNameTag = this.html_EntityNameTag(_plus_1);
            _builder.append(_html_EntityNameTag, "\t");
            _builder.append(" [");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          } else {
            boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(relation.getName());
            boolean _not = (!_isNullOrEmpty_1);
            if (_not) {
              _builder.newLine();
              _builder.append("\t");
              _builder.append("<br/>");
              CharSequence _html_EntityNameTag_1 = this.html_EntityNameTag(relation.getName());
              _builder.append(_html_EntityNameTag_1, "\t");
              _builder.append(" [");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
            }
          }
        }
        _builder.newLine();
        _builder.newLine();
        {
          EObject _target = relation.getLeftEnding().getTarget();
          if ((_target instanceof Entity)) {
            _builder.newLine();
            _builder.append("\t");
            EObject _target_1 = relation.getLeftEnding().getTarget();
            CharSequence _html_AttributeStyleForInheritedPK = this.html_AttributeStyleForInheritedPK(((Entity) _target_1));
            _builder.append(_html_AttributeStyleForInheritedPK, "\t");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          } else {
            EObject _target_2 = relation.getRightEnding().getTarget();
            if ((_target_2 instanceof Entity)) {
              _builder.newLine();
              _builder.append("\t");
              EObject _target_3 = relation.getRightEnding().getTarget();
              CharSequence _html_AttributeStyleForInheritedPK_1 = this.html_AttributeStyleForInheritedPK(((Entity) _target_3));
              _builder.append(_html_AttributeStyleForInheritedPK_1, "\t");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
            }
          }
        }
        _builder.newLine();
        _builder.append("|");
        _builder.newLine();
        _builder.newLine();
        {
          EObject _target_4 = relation.getLeftEnding().getTarget();
          if ((_target_4 instanceof Relation)) {
            _builder.newLine();
            _builder.append("\t");
            Object _xblockexpression = null;
            {
              EObject _target_5 = relation.getLeftEnding().getTarget();
              tempRel = ((Relation) _target_5);
              _xblockexpression = null;
            }
            _builder.append(_xblockexpression, "\t");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            _builder.append("\t");
            EObject _target_5 = tempRel.getLeftEnding().getTarget();
            CharSequence _html_AttributeStyleForInheritedPK_2 = this.html_AttributeStyleForInheritedPK(((Entity) _target_5));
            _builder.append(_html_AttributeStyleForInheritedPK_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("|");
            _builder.newLine();
            _builder.append("\t");
            EObject _target_6 = tempRel.getRightEnding().getTarget();
            CharSequence _html_AttributeStyleForInheritedPK_3 = this.html_AttributeStyleForInheritedPK(((Entity) _target_6));
            _builder.append(_html_AttributeStyleForInheritedPK_3, "\t");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          } else {
            EObject _target_7 = relation.getRightEnding().getTarget();
            if ((_target_7 instanceof Relation)) {
              _builder.newLine();
              _builder.append("\t");
              Object _xblockexpression_1 = null;
              {
                EObject _target_8 = relation.getRightEnding().getTarget();
                tempRel = ((Relation) _target_8);
                _xblockexpression_1 = null;
              }
              _builder.append(_xblockexpression_1, "\t");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.newLine();
              _builder.append("\t");
              EObject _target_8 = tempRel.getLeftEnding().getTarget();
              CharSequence _html_AttributeStyleForInheritedPK_4 = this.html_AttributeStyleForInheritedPK(((Entity) _target_8));
              _builder.append(_html_AttributeStyleForInheritedPK_4, "\t");
              _builder.newLineIfNotEmpty();
              _builder.append("|");
              _builder.newLine();
              _builder.append("\t");
              EObject _target_9 = tempRel.getRightEnding().getTarget();
              CharSequence _html_AttributeStyleForInheritedPK_5 = this.html_AttributeStyleForInheritedPK(((Entity) _target_9));
              _builder.append(_html_AttributeStyleForInheritedPK_5, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        {
          final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(relation.getAttributes(), _function_1);
          boolean _hasElements_1 = false;
          for(final Attribute attribute : _filter_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder.append(" | ");
            } else {
              _builder.appendImmediate(" | ", "");
            }
            _builder.newLine();
            _builder.append("\t\t");
            CharSequence _html_AttributeStyleForPK = this.html_AttributeStyleForPK(attribute);
            _builder.append(_html_AttributeStyleForPK, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.newLine();
        {
          final Function1<Attribute, Boolean> _function_2 = (Attribute it) -> {
            boolean _isIsKey = it.isIsKey();
            return Boolean.valueOf((!_isIsKey));
          };
          Iterable<Attribute> _filter_2 = IterableExtensions.<Attribute>filter(relation.getAttributes(), _function_2);
          boolean _hasElements_2 = false;
          for(final Attribute attribute_1 : _filter_2) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
              _builder.append(" | ");
            } else {
              _builder.appendImmediate(" | ", "");
            }
            _builder.newLine();
            _builder.append("\t");
            String _lowerCase = attribute_1.getName().toLowerCase();
            _builder.append(_lowerCase, "\t");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
      }
      if (_hasElements) {
        _builder.append("] <br/>");
      }
    }
    return _builder;
  }
  
  private CharSequence html_ListPKtoFK(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<Attribute, Boolean> _function = (Attribute it) -> {
        return Boolean.valueOf(it.isIsKey());
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(e.getAttributes(), _function);
      boolean _hasElements = false;
      for(final Attribute att : _filter) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append(" | ");
        } else {
          _builder.appendImmediate(" | ", "");
        }
        _builder.append("<font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font> ");
        String _lowerCase = att.getName().toLowerCase();
        _builder.append(_lowerCase);
        _builder.append("_fk");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence html_ListPKtoFK_Alt(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Entity _is = e.getIs();
      boolean _tripleNotEquals = (_is != null);
      if (_tripleNotEquals) {
        {
          final Function1<Attribute, Boolean> _function = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(e.getIs().getAttributes(), _function);
          boolean _hasElements = false;
          for(final Attribute att : _filter) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            _builder.append("<font color=\"blue\">");
            String _lowerCase = att.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append("_fk</font>");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(e.getAttributes(), _function_1);
          boolean _hasElements_1 = false;
          for(final Attribute att_1 : _filter_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            _builder.append("<font color=\"blue\">");
            String _lowerCase_1 = att_1.getName().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append("_fk</font>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_ListPKtoFK_Alt(final Entity e, final String r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Entity _is = e.getIs();
      boolean _tripleNotEquals = (_is != null);
      if (_tripleNotEquals) {
        {
          final Function1<Attribute, Boolean> _function = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(e.getIs().getAttributes(), _function);
          boolean _hasElements = false;
          for(final Attribute att : _filter) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            _builder.append("<font color=\"blue\">");
            String _lowerCase = att.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append("_fk</font>");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(e.getAttributes(), _function_1);
          boolean _hasElements_1 = false;
          for(final Attribute att_1 : _filter_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            _builder.append("<font color=\"blue\">");
            String _lowerCase_1 = att_1.getName().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append("_fk</font>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_ListPKtoFK_SelfRelationship(final Entity e, final String r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Entity _is = e.getIs();
      boolean _tripleNotEquals = (_is != null);
      if (_tripleNotEquals) {
        {
          final Function1<Attribute, Boolean> _function = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(e.getIs().getAttributes(), _function);
          boolean _hasElements = false;
          for(final Attribute att : _filter) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append(" | ");
            } else {
              _builder.appendImmediate(" | ", "");
            }
            _builder.append("<font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font> ");
            String _lowerCase = att.getName().toLowerCase();
            String _plus = (_lowerCase + "_");
            String _plus_1 = (_plus + r);
            _builder.append(_plus_1);
            _builder.append("_fk");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(e.getAttributes(), _function_1);
          boolean _hasElements_1 = false;
          for(final Attribute att_1 : _filter_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder.append(" | ");
            } else {
              _builder.appendImmediate(" | ", "");
            }
            _builder.append("<font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font> ");
            String _lowerCase_1 = att_1.getName().toLowerCase();
            String _plus_2 = (_lowerCase_1 + "_");
            String _plus_3 = (_plus_2 + r);
            _builder.append(_plus_3);
            _builder.append("_fk");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence html_ListPKtoFK_SelfRelationship_Alt(final Entity e, final String r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Entity _is = e.getIs();
      boolean _tripleNotEquals = (_is != null);
      if (_tripleNotEquals) {
        {
          final Function1<Attribute, Boolean> _function = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(e.getIs().getAttributes(), _function);
          boolean _hasElements = false;
          for(final Attribute att : _filter) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            _builder.append("<font color=\"blue\">");
            String _lowerCase = att.getName().toLowerCase();
            String _plus = (_lowerCase + "_");
            String _plus_1 = (_plus + r);
            _builder.append(_plus_1);
            _builder.append("_fk</font>");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(e.getAttributes(), _function_1);
          boolean _hasElements_1 = false;
          for(final Attribute att_1 : _filter_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            _builder.append("<font color=\"blue\">");
            String _lowerCase_1 = att_1.getName().toLowerCase();
            String _plus_2 = (_lowerCase_1 + "_");
            String _plus_3 = (_plus_2 + r);
            _builder.append(_plus_3);
            _builder.append("_fk</font>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_ListPKtoFK_SelfRelationship_Alt(final Entity e, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Entity _is = e.getIs();
      boolean _tripleNotEquals = (_is != null);
      if (_tripleNotEquals) {
        {
          final Function1<Attribute, Boolean> _function = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(e.getIs().getAttributes(), _function);
          boolean _hasElements = false;
          for(final Attribute att : _filter) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            _builder.append("<font color=\"blue\">");
            String _lowerCase = att.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append("_fk_");
            _builder.append(i);
            _builder.append("</font>");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(e.getAttributes(), _function_1);
          boolean _hasElements_1 = false;
          for(final Attribute att_1 : _filter_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            _builder.append("<font color=\"blue\">");
            String _lowerCase_1 = att_1.getName().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append("_fk_");
            _builder.append(i);
            _builder.append("</font>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_RelationshipsMapping(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<hr style=\"width:100%;text-align:left;margin-left:0\">");
    _builder.newLine();
    _builder.append("<p class=\"sstitle\">");
    _builder.newLine();
    _builder.append("<a href=\"#references\" class=\"btn btn-primary\" data-toggle=\"collapse\"><i class=\"fa fa-arrows-v\" aria-hidden=\"true\"></i></a>");
    _builder.newLine();
    _builder.append("&nbsp; References");
    _builder.newLine();
    _builder.append("</p>\t ");
    _builder.newLine();
    _builder.append("<div id=\"references\" class=\"panel-body collapse in\">\t");
    _builder.newLine();
    _builder.append("<p class=\"field\">\t");
    _builder.newLine();
    _builder.newLine();
    CharSequence _html_GeneralizationSpecialization_Relationship = this.html_GeneralizationSpecialization_Relationship(m);
    _builder.append(_html_GeneralizationSpecialization_Relationship);
    _builder.newLineIfNotEmpty();
    CharSequence _html_1To1_Relationships = this.html_1To1_Relationships(m);
    _builder.append(_html_1To1_Relationships);
    _builder.newLineIfNotEmpty();
    CharSequence _html_1ToN_Relationships = this.html_1ToN_Relationships(m);
    _builder.append(_html_1ToN_Relationships);
    _builder.newLineIfNotEmpty();
    CharSequence _html_NToN_Relationships = this.html_NToN_Relationships(m);
    _builder.append(_html_NToN_Relationships);
    _builder.newLineIfNotEmpty();
    CharSequence _html_Ternary_Relationships = this.html_Ternary_Relationships(m);
    _builder.append(_html_Ternary_Relationships);
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence html_GeneralizationSpecialization_Relationship(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<Entity, Boolean> _function = (Entity i) -> {
        Entity _is = i.getIs();
        return Boolean.valueOf((_is != null));
      };
      Iterable<Entity> _filter = IterableExtensions.<Entity>filter(m.getEntities(), _function);
      for(final Entity subclass : _filter) {
        _builder.append("<br/>");
        _builder.newLine();
        _builder.append("<font color=\"#505050\"><span class=\"label label-pill label-danger\"># Generalization/Specialization</span></br></br>");
        _builder.newLine();
        _builder.append("Attribute (<font color=\"blue\"><b>");
        _builder.newLine();
        {
          final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(subclass.getIs().getAttributes(), _function_1);
          boolean _hasElements = false;
          for(final Attribute superclassAtt : _filter_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            String _lowerCase = superclassAtt.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</b></font>) in ");
        CharSequence _html_EntityNameTag = this.html_EntityNameTag(subclass.toString());
        _builder.append(_html_EntityNameTag);
        _builder.append(" references ");
        CharSequence _html_EntityNameTag_1 = this.html_EntityNameTag(subclass.getIs().toString());
        _builder.append(_html_EntityNameTag_1);
        _builder.newLineIfNotEmpty();
        _builder.append("</br>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private CharSequence html_BinaryRelationshipNameStyle(final String nameRel, final String leftNameRel, final String rightNameRel, final String leftCardinaltyRel, final String rightCardinaltyRel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<br/>");
    _builder.newLine();
    _builder.append("<font color=\"#505050\"><span class=\"label label-pill label-success\">## Binary Relationship</span></br></br>");
    _builder.newLine();
    {
      boolean _isBlank = nameRel.isBlank();
      if (_isBlank) {
        _builder.append(" <i>_UnnamedEntity_</i> ");
      } else {
        boolean _isBlank_1 = nameRel.isBlank();
        boolean _not = (!_isBlank_1);
        if (_not) {
          String _upperCase = nameRel.toUpperCase();
          _builder.append(_upperCase);
        }
      }
    }
    _builder.append(" <i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i>");
    _builder.newLineIfNotEmpty();
    String _upperCase_1 = leftNameRel.toUpperCase();
    String _plus = (_upperCase_1 + " ");
    String _upperCase_2 = leftCardinaltyRel.toUpperCase();
    String _plus_1 = (_plus + _upperCase_2);
    _builder.append(_plus_1);
    _builder.append(" relates ");
    String _upperCase_3 = rightCardinaltyRel.toUpperCase();
    String _plus_2 = (_upperCase_3 + " ");
    String _upperCase_4 = rightNameRel.toUpperCase();
    String _plus_3 = (_plus_2 + _upperCase_4);
    _builder.append(_plus_3);
    _builder.newLineIfNotEmpty();
    _builder.append("</font>");
    _builder.newLine();
    _builder.append("<br/>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence html_1To1_Relationships(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<Relation, Boolean> _function = (Relation i) -> {
        return Boolean.valueOf(((i.getLeftEnding().getTarget() instanceof Entity) && (i.getRightEnding().getTarget() instanceof Entity)));
      };
      Iterable<Relation> _filter = IterableExtensions.<Relation>filter(m.getRelations(), _function);
      for(final Relation relation : _filter) {
        {
          if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:1)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:1)")))) {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            CharSequence _html_BinaryRelationshipNameStyle = this.html_BinaryRelationshipNameStyle(relation.getName(), relation.getLeftEnding().getTarget().toString(), relation.getRightEnding().getTarget().toString(), relation.getLeftEnding().getCardinality(), relation.getRightEnding().getCardinality());
            _builder.append(_html_BinaryRelationshipNameStyle, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("</br>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("Attribute (<font color=\"blue\"><b> ");
            _builder.newLine();
            {
              EList<Entity> _entities = m.getEntities();
              for(final Entity aux : _entities) {
                {
                  boolean _equalsIgnoreCase = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(aux.getName());
                  if (_equalsIgnoreCase) {
                    {
                      Entity _is = aux.getIs();
                      boolean _tripleEquals = (_is == null);
                      if (_tripleEquals) {
                        {
                          boolean _equalsIgnoreCase_1 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                          boolean _not = (!_equalsIgnoreCase_1);
                          if (_not) {
                            {
                              final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
                                return Boolean.valueOf(it.isIsKey());
                              };
                              Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(aux.getAttributes(), _function_1);
                              for(final Attribute aux2 : _filter_1) {
                                _builder.append("\t");
                                String _lowerCase = aux2.getName().toLowerCase();
                                _builder.append(_lowerCase, "\t");
                                _builder.append("_fk");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          } else {
                            _builder.append("\t");
                            CharSequence _html_ListPKtoFK_SelfRelationship = this.html_ListPKtoFK_SelfRelationship(aux, relation.getName().toLowerCase());
                            _builder.append(_html_ListPKtoFK_SelfRelationship, "\t");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      } else {
                        Entity _is_1 = aux.getIs();
                        boolean _tripleNotEquals = (_is_1 != null);
                        if (_tripleNotEquals) {
                          {
                            final Function1<Attribute, Boolean> _function_2 = (Attribute it) -> {
                              return Boolean.valueOf(it.isIsKey());
                            };
                            Iterable<Attribute> _filter_2 = IterableExtensions.<Attribute>filter(aux.getIs().getAttributes(), _function_2);
                            boolean _hasElements = false;
                            for(final Attribute aux3 : _filter_2) {
                              if (!_hasElements) {
                                _hasElements = true;
                              } else {
                                _builder.appendImmediate(" , ", "\t");
                              }
                              {
                                boolean _equalsIgnoreCase_2 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                                boolean _not_1 = (!_equalsIgnoreCase_2);
                                if (_not_1) {
                                  _builder.append("\t");
                                  String _lowerCase_1 = aux3.getName().toLowerCase();
                                  _builder.append(_lowerCase_1, "\t");
                                  _builder.append("_fk");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  _builder.append("\t");
                                  String _lowerCase_2 = aux3.getName().toLowerCase();
                                  String _plus = (_lowerCase_2 + "_");
                                  String _lowerCase_3 = relation.getName().toLowerCase();
                                  String _plus_1 = (_plus + _lowerCase_3);
                                  _builder.append(_plus_1, "\t");
                                  _builder.append("_fk");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            _builder.append("</b></font>) in ");
            CharSequence _html_EntityNameTag = this.html_EntityNameTag(relation.getRightEnding().getTarget().toString());
            _builder.append(_html_EntityNameTag);
            _builder.append(" references ");
            CharSequence _html_EntityNameTag_1 = this.html_EntityNameTag(relation.getLeftEnding().getTarget().toString());
            _builder.append(_html_EntityNameTag_1);
            _builder.newLineIfNotEmpty();
            _builder.append("</br>");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_1ToN_Relationships(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    Entity temp = null;
    _builder.newLineIfNotEmpty();
    {
      final Function1<Relation, Boolean> _function = (Relation i) -> {
        return Boolean.valueOf(((i.getLeftEnding().getTarget() instanceof Entity) && (i.getRightEnding().getTarget() instanceof Entity)));
      };
      Iterable<Relation> _filter = IterableExtensions.<Relation>filter(m.getRelations(), _function);
      for(final Relation relation : _filter) {
        {
          if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:1)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:N)")))) {
            _builder.append("\t");
            _builder.newLine();
            CharSequence _html_BinaryRelationshipNameStyle = this.html_BinaryRelationshipNameStyle(relation.getName(), relation.getLeftEnding().getTarget().toString(), relation.getRightEnding().getTarget().toString(), relation.getLeftEnding().getCardinality(), relation.getRightEnding().getCardinality());
            _builder.append(_html_BinaryRelationshipNameStyle);
            _builder.newLineIfNotEmpty();
            _builder.append("</br>");
            _builder.newLine();
            _builder.append("Attribute (<font color=\"blue\"><b> ");
            _builder.newLine();
            {
              EList<Entity> _entities = m.getEntities();
              for(final Entity aux : _entities) {
                {
                  boolean _equalsIgnoreCase = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(aux.getName());
                  if (_equalsIgnoreCase) {
                    {
                      Entity _is = aux.getIs();
                      boolean _tripleEquals = (_is == null);
                      if (_tripleEquals) {
                        {
                          boolean _equalsIgnoreCase_1 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                          boolean _not = (!_equalsIgnoreCase_1);
                          if (_not) {
                            _builder.append("\t\t");
                            CharSequence _html_ListPKtoFK_Alt = this.html_ListPKtoFK_Alt(aux);
                            _builder.append(_html_ListPKtoFK_Alt, "\t\t");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _equalsIgnoreCase_2 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                            if (_equalsIgnoreCase_2) {
                              _builder.append("\t\t");
                              CharSequence _html_ListPKtoFK_SelfRelationship_Alt = this.html_ListPKtoFK_SelfRelationship_Alt(aux, relation.getName().toLowerCase());
                              _builder.append(_html_ListPKtoFK_SelfRelationship_Alt, "\t\t");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      } else {
                        Entity _is_1 = aux.getIs();
                        boolean _tripleNotEquals = (_is_1 != null);
                        if (_tripleNotEquals) {
                          {
                            boolean _equalsIgnoreCase_3 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                            if (_equalsIgnoreCase_3) {
                              _builder.append("\t\t");
                              CharSequence _html_ListPKtoFK_SelfRelationship_Alt_1 = this.html_ListPKtoFK_SelfRelationship_Alt(aux, relation.getName().toLowerCase());
                              _builder.append(_html_ListPKtoFK_SelfRelationship_Alt_1, "\t\t");
                              _builder.newLineIfNotEmpty();
                            } else {
                              boolean _equalsIgnoreCase_4 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                              boolean _not_1 = (!_equalsIgnoreCase_4);
                              if (_not_1) {
                                _builder.append("\t\t");
                                Object _xblockexpression = null;
                                {
                                  EObject _target = relation.getLeftEnding().getTarget();
                                  temp = ((Entity) _target);
                                  _xblockexpression = null;
                                }
                                _builder.append(_xblockexpression, "\t\t");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t");
                                CharSequence _html_ListPKtoFK_Alt_1 = this.html_ListPKtoFK_Alt(temp.getIs());
                                _builder.append(_html_ListPKtoFK_Alt_1, "\t\t");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            _builder.append("</b></font>) in ");
            CharSequence _html_EntityNameTag = this.html_EntityNameTag(relation.getRightEnding().getTarget().toString());
            _builder.append(_html_EntityNameTag);
            _builder.append(" references ");
            CharSequence _html_EntityNameTag_1 = this.html_EntityNameTag(relation.getLeftEnding().getTarget().toString());
            _builder.append(_html_EntityNameTag_1);
            _builder.newLineIfNotEmpty();
            _builder.append("</br>");
            _builder.newLine();
          } else {
            if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:N)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:1)")))) {
              _builder.newLine();
              CharSequence _html_BinaryRelationshipNameStyle_1 = this.html_BinaryRelationshipNameStyle(relation.getName(), relation.getLeftEnding().getTarget().toString(), relation.getRightEnding().getTarget().toString(), relation.getLeftEnding().getCardinality(), relation.getRightEnding().getCardinality());
              _builder.append(_html_BinaryRelationshipNameStyle_1);
              _builder.newLineIfNotEmpty();
              _builder.append("</br>");
              _builder.newLine();
              _builder.append("Attribute (<font color=\"blue\"><b>");
              _builder.newLine();
              {
                EList<Entity> _entities_1 = m.getEntities();
                for(final Entity aux_1 : _entities_1) {
                  {
                    boolean _equalsIgnoreCase_5 = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(aux_1.getName());
                    if (_equalsIgnoreCase_5) {
                      {
                        Entity _is_2 = aux_1.getIs();
                        boolean _tripleEquals_1 = (_is_2 == null);
                        if (_tripleEquals_1) {
                          {
                            boolean _equalsIgnoreCase_6 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                            boolean _not_2 = (!_equalsIgnoreCase_6);
                            if (_not_2) {
                              _builder.append("\t\t");
                              CharSequence _html_ListPKtoFK_Alt_2 = this.html_ListPKtoFK_Alt(aux_1);
                              _builder.append(_html_ListPKtoFK_Alt_2, "\t\t");
                              _builder.newLineIfNotEmpty();
                            } else {
                              boolean _equalsIgnoreCase_7 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                              if (_equalsIgnoreCase_7) {
                                _builder.append("\t\t");
                                CharSequence _html_ListPKtoFK_SelfRelationship_Alt_2 = this.html_ListPKtoFK_SelfRelationship_Alt(aux_1, relation.getName().toLowerCase());
                                _builder.append(_html_ListPKtoFK_SelfRelationship_Alt_2, "\t\t");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        } else {
                          Entity _is_3 = aux_1.getIs();
                          boolean _tripleNotEquals_1 = (_is_3 != null);
                          if (_tripleNotEquals_1) {
                            {
                              boolean _equalsIgnoreCase_8 = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(relation.getLeftEnding().getTarget().toString());
                              if (_equalsIgnoreCase_8) {
                                _builder.append("\t\t");
                                _builder.newLine();
                                _builder.append("\t\t");
                                _builder.newLine();
                                _builder.append("\t\t");
                                _builder.newLine();
                                _builder.append("\t\t");
                                CharSequence _html_ListPKtoFK_SelfRelationship_Alt_3 = this.html_ListPKtoFK_SelfRelationship_Alt(aux_1, relation.getName().toLowerCase());
                                _builder.append(_html_ListPKtoFK_SelfRelationship_Alt_3, "\t\t");
                                _builder.newLineIfNotEmpty();
                              } else {
                                boolean _equalsIgnoreCase_9 = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(relation.getLeftEnding().getTarget().toString());
                                boolean _not_3 = (!_equalsIgnoreCase_9);
                                if (_not_3) {
                                  _builder.append("\t\t");
                                  Object _xblockexpression_1 = null;
                                  {
                                    EObject _target = relation.getRightEnding().getTarget();
                                    temp = ((Entity) _target);
                                    _xblockexpression_1 = null;
                                  }
                                  _builder.append(_xblockexpression_1, "\t\t");
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("\t\t");
                                  CharSequence _html_ListPKtoFK_Alt_3 = this.html_ListPKtoFK_Alt(temp.getIs());
                                  _builder.append(_html_ListPKtoFK_Alt_3, "\t\t");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              _builder.append("</b></font>) in ");
              CharSequence _html_EntityNameTag_2 = this.html_EntityNameTag(relation.getLeftEnding().getTarget().toString());
              _builder.append(_html_EntityNameTag_2);
              _builder.append(" references ");
              CharSequence _html_EntityNameTag_3 = this.html_EntityNameTag(relation.getRightEnding().getTarget().toString());
              _builder.append(_html_EntityNameTag_3);
              _builder.newLineIfNotEmpty();
              _builder.append("</br>");
              _builder.newLine();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_NToN_Relationships(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      final Function1<Relation, Boolean> _function = (Relation i) -> {
        return Boolean.valueOf(((i.getLeftEnding().getTarget() instanceof Entity) && (i.getRightEnding().getTarget() instanceof Entity)));
      };
      Iterable<Relation> _filter = IterableExtensions.<Relation>filter(m.getRelations(), _function);
      for(final Relation relation : _filter) {
        _builder.newLine();
        {
          if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:N)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:N)")))) {
            _builder.newLine();
            CharSequence _html_BinaryRelationshipNameStyle = this.html_BinaryRelationshipNameStyle(relation.getName(), relation.getLeftEnding().getTarget().toString(), relation.getRightEnding().getTarget().toString(), relation.getLeftEnding().getCardinality(), relation.getRightEnding().getCardinality());
            _builder.append(_html_BinaryRelationshipNameStyle);
            _builder.newLineIfNotEmpty();
            _builder.append("</br>");
            _builder.newLine();
            _builder.append("Attribute (<font color=\"blue\"><b> ");
            _builder.newLine();
            _builder.newLine();
            {
              boolean _equalsIgnoreCase = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
              if (_equalsIgnoreCase) {
                EObject _target = relation.getLeftEnding().getTarget();
                CharSequence _html_ListPKtoFK_SelfRelationship_Alt = this.html_ListPKtoFK_SelfRelationship_Alt(((Entity) _target), 1);
                _builder.append(_html_ListPKtoFK_SelfRelationship_Alt);
                _builder.newLineIfNotEmpty();
              } else {
                EObject _target_1 = relation.getLeftEnding().getTarget();
                CharSequence _html_ListPKtoFK_Alt = this.html_ListPKtoFK_Alt(((Entity) _target_1));
                _builder.append(_html_ListPKtoFK_Alt);
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.newLine();
            _builder.append("</b></font>) in ");
            CharSequence _html_EntityNameTag = this.html_EntityNameTag(relation.getName());
            _builder.append(_html_EntityNameTag);
            _builder.append(" references ");
            CharSequence _html_EntityNameTag_1 = this.html_EntityNameTag(relation.getLeftEnding().getTarget().toString());
            _builder.append(_html_EntityNameTag_1);
            _builder.newLineIfNotEmpty();
            _builder.append("</br></br>");
            _builder.newLine();
            _builder.newLine();
            _builder.append("Attribute (<font color=\"blue\"><b> ");
            _builder.newLine();
            _builder.newLine();
            {
              boolean _equalsIgnoreCase_1 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
              if (_equalsIgnoreCase_1) {
                EObject _target_2 = relation.getRightEnding().getTarget();
                CharSequence _html_ListPKtoFK_SelfRelationship_Alt_1 = this.html_ListPKtoFK_SelfRelationship_Alt(((Entity) _target_2), 2);
                _builder.append(_html_ListPKtoFK_SelfRelationship_Alt_1);
                _builder.newLineIfNotEmpty();
              } else {
                EObject _target_3 = relation.getRightEnding().getTarget();
                CharSequence _html_ListPKtoFK_Alt_1 = this.html_ListPKtoFK_Alt(((Entity) _target_3));
                _builder.append(_html_ListPKtoFK_Alt_1);
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t\t");
            _builder.newLine();
            _builder.append("</b></font>) in ");
            CharSequence _html_EntityNameTag_2 = this.html_EntityNameTag(relation.getName());
            _builder.append(_html_EntityNameTag_2);
            _builder.append(" references ");
            CharSequence _html_EntityNameTag_3 = this.html_EntityNameTag(relation.getRightEnding().getTarget().toString());
            _builder.append(_html_EntityNameTag_3);
            _builder.newLineIfNotEmpty();
            _builder.append("</br>");
            _builder.newLine();
            _builder.newLine();
          }
        }
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private CharSequence html_Ternary_Relationships(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<Relation, Boolean> _function = (Relation i) -> {
        return Boolean.valueOf(((i.getLeftEnding().getTarget() instanceof Relation) || (i.getRightEnding().getTarget() instanceof Relation)));
      };
      Iterable<Relation> _filter = IterableExtensions.<Relation>filter(m.getRelations(), _function);
      boolean _hasElements = false;
      for(final Relation relation : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("</br", "");
        }
        _builder.append("<br/><font color=\"#505050\"><span class=\"label label-pill label-warning\">### Ternary Relationship</span></br></br>");
        _builder.newLine();
        _builder.newLine();
        _builder.append("<font color=\"#505050\">");
        {
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(relation.getName());
          if (_isNullOrEmpty) {
            _builder.append(" <i>_Unnamed_</i> ");
          } else {
            boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(relation.getName());
            boolean _not = (!_isNullOrEmpty_1);
            if (_not) {
              String _upperCase = relation.getName().toUpperCase();
              _builder.append(_upperCase);
            }
          }
        }
        _builder.append(" <i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i>");
        _builder.newLineIfNotEmpty();
        String _upperCase_1 = relation.getLeftEnding().getTarget().toString().toUpperCase();
        String _plus = (_upperCase_1 + " ");
        String _upperCase_2 = relation.getLeftEnding().getCardinality().toString().toUpperCase();
        String _plus_1 = (_plus + _upperCase_2);
        _builder.append(_plus_1);
        _builder.append(" relates ");
        String _upperCase_3 = relation.getRightEnding().getCardinality().toUpperCase();
        String _plus_2 = (_upperCase_3 + " ");
        String _upperCase_4 = relation.getRightEnding().getTarget().toString().toUpperCase();
        String _plus_3 = (_plus_2 + _upperCase_4);
        _builder.append(_plus_3);
        _builder.newLineIfNotEmpty();
        _builder.append("</font><br/></br>");
        _builder.newLine();
        CharSequence _html_Ternary_Relationships_Attributes = this.html_Ternary_Relationships_Attributes(m, relation);
        _builder.append(_html_Ternary_Relationships_Attributes);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence html_Ternary_Relationships_Attributes(final ERModel m, final Relation r) {
    StringConcatenation _builder = new StringConcatenation();
    Entity objEntity = null;
    _builder.newLineIfNotEmpty();
    Relation objRelation = null;
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("Attribute (<font color=\"blue\"><b>");
    _builder.newLine();
    _builder.newLine();
    {
      EObject _target = r.getLeftEnding().getTarget();
      if ((_target instanceof Entity)) {
        _builder.newLine();
        _builder.append("\t");
        Object _xblockexpression = null;
        {
          EObject _target_1 = r.getLeftEnding().getTarget();
          objEntity = ((Entity) _target_1);
          _xblockexpression = null;
        }
        _builder.append(_xblockexpression, "\t");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        {
          final Function1<Attribute, Boolean> _function = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(objEntity.getAttributes(), _function);
          boolean _hasElements = false;
          for(final Attribute att : _filter) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" , ", "\t");
            }
            _builder.append("\t");
            String _lowerCase = att.getName().toString().toLowerCase();
            _builder.append(_lowerCase, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        _builder.append("</b></font>) in ");
        CharSequence _html_EntityNameTag = this.html_EntityNameTag(r.getName());
        _builder.append(_html_EntityNameTag);
        _builder.append(" references ");
        CharSequence _html_EntityNameTag_1 = this.html_EntityNameTag(r.getLeftEnding().getTarget().toString());
        _builder.append(_html_EntityNameTag_1);
        _builder.newLineIfNotEmpty();
        _builder.append("</br></br>");
        _builder.newLine();
        _builder.newLine();
      } else {
        EObject _target_1 = r.getRightEnding().getTarget();
        if ((_target_1 instanceof Entity)) {
          _builder.newLine();
          _builder.append("\t");
          Object _xblockexpression_1 = null;
          {
            EObject _target_2 = r.getRightEnding().getTarget();
            objEntity = ((Entity) _target_2);
            _xblockexpression_1 = null;
          }
          _builder.append(_xblockexpression_1, "\t");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          {
            final Function1<Attribute, Boolean> _function_1 = (Attribute it) -> {
              return Boolean.valueOf(it.isIsKey());
            };
            Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(objEntity.getAttributes(), _function_1);
            boolean _hasElements_1 = false;
            for(final Attribute att_1 : _filter_1) {
              if (!_hasElements_1) {
                _hasElements_1 = true;
              } else {
                _builder.appendImmediate(" , ", "\t");
              }
              _builder.append("\t");
              String _lowerCase_1 = att_1.getName().toString().toLowerCase();
              _builder.append(_lowerCase_1, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.newLine();
          _builder.append("</b></font>) in ");
          CharSequence _html_EntityNameTag_2 = this.html_EntityNameTag(r.getName());
          _builder.append(_html_EntityNameTag_2);
          _builder.append(" references ");
          CharSequence _html_EntityNameTag_3 = this.html_EntityNameTag(r.getRightEnding().getTarget().toString());
          _builder.append(_html_EntityNameTag_3);
          _builder.newLineIfNotEmpty();
          _builder.append("</br></br>");
          _builder.newLine();
          _builder.newLine();
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      EObject _target_2 = r.getLeftEnding().getTarget();
      if ((_target_2 instanceof Relation)) {
        _builder.newLine();
        Object _xblockexpression_2 = null;
        {
          EObject _target_3 = r.getLeftEnding().getTarget();
          objRelation = ((Relation) _target_3);
          _xblockexpression_2 = null;
        }
        _builder.append(_xblockexpression_2);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        Object _xblockexpression_3 = null;
        {
          EObject _target_3 = objRelation.getLeftEnding().getTarget();
          objEntity = ((Entity) _target_3);
          _xblockexpression_3 = null;
        }
        _builder.append(_xblockexpression_3);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("Attribute (<font color=\"blue\"><b>");
        _builder.newLine();
        _builder.newLine();
        {
          final Function1<Attribute, Boolean> _function_2 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_2 = IterableExtensions.<Attribute>filter(objEntity.getAttributes(), _function_2);
          boolean _hasElements_2 = false;
          for(final Attribute att_2 : _filter_2) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            String _lowerCase_2 = att_2.getName().toString().toLowerCase();
            _builder.append(_lowerCase_2);
            _builder.newLineIfNotEmpty();
          }
          if (_hasElements_2) {
            _builder.append(" , ");
          }
        }
        _builder.newLine();
        Object _xblockexpression_4 = null;
        {
          EObject _target_3 = objRelation.getRightEnding().getTarget();
          objEntity = ((Entity) _target_3);
          _xblockexpression_4 = null;
        }
        _builder.append(_xblockexpression_4);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        {
          final Function1<Attribute, Boolean> _function_3 = (Attribute it) -> {
            return Boolean.valueOf(it.isIsKey());
          };
          Iterable<Attribute> _filter_3 = IterableExtensions.<Attribute>filter(objEntity.getAttributes(), _function_3);
          boolean _hasElements_3 = false;
          for(final Attribute att_3 : _filter_3) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(" , ", "");
            }
            String _lowerCase_3 = att_3.getName().toString().toLowerCase();
            _builder.append(_lowerCase_3);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        _builder.append("</b></font>) in ");
        CharSequence _html_EntityNameTag_4 = this.html_EntityNameTag(r.getName());
        _builder.append(_html_EntityNameTag_4);
        _builder.append(" references ");
        CharSequence _html_EntityNameTag_5 = this.html_EntityNameTag(r.getLeftEnding().getTarget().toString());
        _builder.append(_html_EntityNameTag_5);
        _builder.newLineIfNotEmpty();
        _builder.append("</br></br>");
        _builder.newLine();
        _builder.newLine();
      } else {
        EObject _target_3 = r.getRightEnding().getTarget();
        if ((_target_3 instanceof Relation)) {
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          Object _xblockexpression_5 = null;
          {
            EObject _target_4 = r.getRightEnding().getTarget();
            objRelation = ((Relation) _target_4);
            _xblockexpression_5 = null;
          }
          _builder.append(_xblockexpression_5, "\t");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("\t");
          Object _xblockexpression_6 = null;
          {
            EObject _target_4 = objRelation.getLeftEnding().getTarget();
            objEntity = ((Entity) _target_4);
            _xblockexpression_6 = null;
          }
          _builder.append(_xblockexpression_6, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("Attribute (<font color=\"blue\"><b>");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          {
            final Function1<Attribute, Boolean> _function_4 = (Attribute it) -> {
              return Boolean.valueOf(it.isIsKey());
            };
            Iterable<Attribute> _filter_4 = IterableExtensions.<Attribute>filter(objEntity.getAttributes(), _function_4);
            boolean _hasElements_4 = false;
            for(final Attribute att_4 : _filter_4) {
              if (!_hasElements_4) {
                _hasElements_4 = true;
              } else {
                _builder.appendImmediate(" , ", "\t");
              }
              _builder.append("\t");
              String _lowerCase_4 = att_4.getName().toString().toLowerCase();
              _builder.append(_lowerCase_4, "\t");
              _builder.newLineIfNotEmpty();
            }
            if (_hasElements_4) {
              _builder.append(" , ", "\t");
            }
          }
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          Object _xblockexpression_7 = null;
          {
            EObject _target_4 = objRelation.getRightEnding().getTarget();
            objEntity = ((Entity) _target_4);
            _xblockexpression_7 = null;
          }
          _builder.append(_xblockexpression_7, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.newLine();
          {
            final Function1<Attribute, Boolean> _function_5 = (Attribute it) -> {
              return Boolean.valueOf(it.isIsKey());
            };
            Iterable<Attribute> _filter_5 = IterableExtensions.<Attribute>filter(objEntity.getAttributes(), _function_5);
            boolean _hasElements_5 = false;
            for(final Attribute att_5 : _filter_5) {
              if (!_hasElements_5) {
                _hasElements_5 = true;
              } else {
                _builder.appendImmediate(" , ", "\t");
              }
              _builder.append("\t");
              String _lowerCase_5 = att_5.getName().toString().toLowerCase();
              _builder.append(_lowerCase_5, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</b></font>) in ");
          CharSequence _html_EntityNameTag_6 = this.html_EntityNameTag(r.getName());
          _builder.append(_html_EntityNameTag_6, "\t");
          _builder.append(" references ");
          CharSequence _html_EntityNameTag_7 = this.html_EntityNameTag(r.getRightEnding().getTarget().toString());
          _builder.append(_html_EntityNameTag_7, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("</br></br>");
          _builder.newLine();
          _builder.newLine();
        }
      }
    }
    _builder.newLine();
    return _builder;
  }
}

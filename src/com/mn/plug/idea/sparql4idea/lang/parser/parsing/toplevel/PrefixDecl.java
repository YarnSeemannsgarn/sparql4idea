package com.mn.plug.idea.sparql4idea.lang.parser.parsing.toplevel;

import com.intellij.lang.PsiBuilder;
import com.mn.plug.idea.sparql4idea.lang.lexer.SparqlTokenTypes;
import com.mn.plug.idea.sparql4idea.lang.parser.SparqlElementTypes;
import com.mn.plug.idea.sparql4idea.lang.parser.parsing.lit.IriRef;
import com.mn.plug.idea.sparql4idea.lang.parser.parsing.lit.PNameNS;
import com.mn.plug.idea.sparql4idea.lang.parser.parsing.util.ParserUtils;

/**
 * Generated JavaDoc Comment.
 *
 * @author Matt Nathan
 */
public class PrefixDecl {

  public static boolean parse(PsiBuilder builder) {
    final PsiBuilder.Marker prefixDecl = builder.mark();

    if (ParserUtils.getToken(builder, SparqlTokenTypes.KW_PREFIX, "Expecing \"PREFIX\"")) {
      if (PNameNS.parse(builder)) {
        IriRef.parse(builder);
      }
    }

    prefixDecl.done(SparqlElementTypes.PREFIX_DECL);

    return true;
  }
}
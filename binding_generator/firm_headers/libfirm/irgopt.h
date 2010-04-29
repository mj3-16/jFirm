/*
 * Copyright (C) 1995-2008 University of Karlsruhe.  All right reserved.
 *
 * This file is part of libFirm.
 *
 * This file may be distributed and/or modified under the terms of the
 * GNU General Public License version 2 as published by the Free Software
 * Foundation and appearing in the file LICENSE.GPL included in the
 * packaging of this file.
 *
 * Licensees holding valid libFirm Professional Edition licenses may use
 * this file in accordance with the libFirm Commercial License.
 * Agreement provided with the Software.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */

/**
 * @file
 * @brief   Optimizations for a whole ir graph, i.e., a procedure.
 * @author  Christian Schaefer, Goetz Lindenmaier, Sebastian Felis
 * @version $Id: irgopt.h 27271 2010-03-07 22:21:24Z matze $
 */
#ifndef FIRM_IR_IRGOPT_H
#define FIRM_IR_IRGOPT_H

#include "firm_types.h"

/** Applies local optimizations (see iropt.h) to all nodes reachable from node n.
 *
 * @param n The node to be optimized.
 */
void local_optimize_node(ir_node *n);

/** Applies local optimizations (see iropt.h) to all nodes in the graph.
 *
 * @param irg  The graph to be optimized.
 *
 * After applying local_optimize_graph() to a IR-graph, Bad nodes
 * only occur as predecessor of Block and Phi nodes.
 */
void local_optimize_graph(ir_graph *irg);

/** Applies local optimizations (see iropt.h) to all nodes in the graph.
 *
 * After applying optimize_graph_df() to a IR-graph, Bad nodes
 * only occur as predecessor of Block and Phi nodes.
 *
 * This version uses fixpoint iteration.
 *
 * @param irg  The graph to be optimized.
 *
 * @return non-zero if the optimization could be applied, 0 else
 */
int optimize_graph_df(ir_graph *irg);

/**
 * Creates an ir_graph pass for optimize_graph_df().
 *
 * @param name     the name of this pass or NULL
 *
 * @return  the newly created ir_graph pass
 */
ir_graph_pass_t *optimize_graph_df_pass(const char *name);

/** Places an empty basic block on critical control flow edges thereby
 * removing them.
 *
 * A critical control flow edge is an edge from a block with several
 * control exits to a block with several control entries (See Muchnic
 * p. 407). Exception edges are always ignored.
 *
 * @param irg  IR Graph
 */
void remove_critical_cf_edges(ir_graph *irg);

/** Places an empty basic block on critical control flow edges thereby
 * removing them.
 *
 * A critical control flow edge is an edge from a block with several
 * control exits to a block with several control entries (See Muchnic
 * p. 407).
 *
 * @param irg                     IR Graph
 * @param ignore_exception_edges  if non-zero, exception edges will be ignored
 */
void remove_critical_cf_edges_ex(ir_graph *irg, int ignore_exception_edges);

#endif
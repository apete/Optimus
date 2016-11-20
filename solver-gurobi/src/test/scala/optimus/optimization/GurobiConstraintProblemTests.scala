package optimus.optimization

import optimus.optimization.SolverLib.SolverLib

/**
  * N-Queens puzzle using MIP programming.
  */
final class GurobiConstraintProblemTests extends ConstraintProblemTests {

  def solver: SolverLib = SolverLib.gurobi
}

/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2018 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.supplychain.service;

import com.axelor.apps.stock.db.StockMove;
import com.axelor.apps.stock.db.StockMoveLine;
import com.axelor.exception.AxelorException;
import java.util.List;

public interface StockMoveServiceSupplychain {

  public List<StockMoveLine> addSubLines(List<StockMoveLine> list);

  public List<StockMoveLine> removeSubLines(List<StockMoveLine> lines);

  /**
   * Check reserved qty of a stock move by comparing old and new lines.
   *
   * @param stockMove a planned stock move.
   */
  public boolean hasReservedQtyChanged(StockMove oldStockMove, StockMove newStockMove)
      throws AxelorException;

  /**
   * Update reserved qty of a stock move by canceling then planning it.
   *
   * @param stockMove a planned stock move.
   */
  public void updateReservedQty(StockMove stockMove) throws AxelorException;
}

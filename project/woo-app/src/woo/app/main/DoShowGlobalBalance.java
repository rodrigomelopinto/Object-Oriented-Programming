package woo.app.main;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;                                                                                  
import pt.tecnico.po.ui.Input;              
import woo.Storefront;

/**
 * Show global balance.
 */
public class DoShowGlobalBalance extends Command<Storefront> {

  private Storefront _receiver;

  public DoShowGlobalBalance(Storefront receiver) {
    super(Label.SHOW_BALANCE, receiver);
    _receiver = receiver;
  }

  @Override
  public final void execute() {
    _display.addLine(Message.currentBalance(
      _receiver.showAvailableBalance(),_receiver.showAccountingBalance()));
    _display.display();
  }
}

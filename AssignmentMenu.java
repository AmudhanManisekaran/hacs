import javax.swing.*;


/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author amudhan
 * @version 2.0
 */

abstract class AssignmentMenu extends JDialog
{
  abstract void ShowMenu(Assignment ass,Person per);
  AssignmentMenu()
  {
    setModal(true);
    setSize(575,330);
  }
}